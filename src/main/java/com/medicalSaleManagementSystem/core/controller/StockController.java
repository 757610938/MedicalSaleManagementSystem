package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.model.BO.StockBo;
import com.medicalSaleManagementSystem.core.model.entity.Stock;
import com.medicalSaleManagementSystem.core.service.StockService;
import com.medicalSaleManagementSystem.util.Response;
import com.medicalSaleManagementSystem.util.ResponseUtil;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@Scope(value = "prototype")
public class StockController {

    @Autowired
    private StockService stockService;

    @RequestMapping("/stock")
    public String index() {
        return "/stockManage/stock";
    }

    private static final String SEARCH_BY_MEDICINE_ID = "searchByMedicineId";
    private static final String SEARCH_BY_MEDICINE_NAME = "searchByMedicineName";
    private static final String SEARCH_BY_MEDICINE_CATEGORY = "searchByMedicineCategory";
    private static final String SEARCH_ALL = "searchAll";

    /**
     * 查询库存信息
     *
     * @param searchType      查询类型
     * @param keyword         查询关键字
     * @param warehouseBelong 查询仓库
     * @param offset          分页偏移值
     * @param limit           分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    private Map<String, Object> query(String searchType, String keyword, String warehouseBelong, int offset,
                                      int limit) {

        Map<String, Object> queryResult = null;

        switch (searchType) {
            case "SEARCH_ALL":

                if (StringUtils.isNumeric(warehouseBelong)) {
                    Integer whseId = Integer.valueOf(warehouseBelong);
                    queryResult = stockService.selectAll(whseId, offset, limit);

                } else {
                    queryResult = stockService.selectAll(null, offset, limit);

                }
                break;
            case "SEARCH_BY_MEDICINE_ID":

                if (StringUtils.isNumeric(keyword)) {
                    Integer medicineId = Integer.valueOf(keyword);
                    if (StringUtils.isNumeric(warehouseBelong)) {
                        Integer whseId = Integer.valueOf(warehouseBelong);
                        queryResult = stockService.selectByMedicineID(medicineId, whseId, offset, limit);
                    } else
                        queryResult = stockService.selectByMedicineID(medicineId, null, offset, limit);
                }
                break;
            case "SEARCH_BY_MEDICINE_CATEGORY":
                if (StringUtils.isNumeric(warehouseBelong)) {
                    Integer whseId = Integer.valueOf(warehouseBelong);
                    queryResult = stockService.selectByMedicineCategory(keyword, whseId, offset, limit);
                } else
                    queryResult = stockService.selectByMedicineCategory(keyword, null, offset, limit);
                break;
            case "SEARCH_BY_MEDICINE_NAME":
                System.out.println("242343434534");
                if (StringUtils.isNumeric(warehouseBelong)) {
                    Integer whseId = Integer.valueOf(warehouseBelong);
                    queryResult = stockService.selectByMedicineName(keyword, whseId, offset, limit);
                    System.out.println("111111111");
                } else{
                    queryResult = stockService.selectByMedicineName(keyword, null, offset, limit);
                    System.out.println("2222222222");}
                break;
            default:
                // do other thing
                break;
        }

        return queryResult;
    }

    /**
     * 可指定仓库对库存信息查询
     *
     * @param keyword         查询关键字
     * @param searchType      查询类型
     * @param warehouseBelong 查询所属的仓库
     * @param offset          分页偏移值
     * @param limit           分页大小
     * @return 结果的一个Map，其中： key为 rows 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @SuppressWarnings("unchecked")
    @ResponseBody
    @RequestMapping(value = "/stockManage/stock", method = RequestMethod.GET)
    public Map<String, Object> getStockListWithWarehouseId(@RequestParam(value = "keyword") String keyword,
                                                           @RequestParam(value = "searchType") String searchType, @RequestParam(value = "warehouseBelong") String warehouseBelong,
                                                           @RequestParam(value = "offset") int offset, @RequestParam(value = "limit") int limit) {
        /*/{keyword}/{searchType}/{warehouseBelong}/{offset}/{limit}*/

        System.out.println("key=" + keyword);
        System.out.println("searchType=" + searchType);
        System.out.println("warehouseBelong=" + warehouseBelong);
        System.out.println("offset=" + offset);
        System.out.println("limit=" + limit);

        // 初始化 Response
        Response responseContent = ResponseUtil.newResponseInstance();

        List<StockBo> rows;
        long total = 0;

        // query
        Map<String, Object> queryResult = query(searchType, keyword, warehouseBelong, offset, limit);

        //System.out.println("我到这里了呵呵呵和...");
        if (queryResult != null) {
            rows = (List<StockBo>) queryResult.get("data");
            total = (long) queryResult.get("total");
            //System.out.println("我到这里了...");
        } else {
            rows = new ArrayList<>();
            //System.out.println("我到这里了哈哈哈哈...");
        }
        responseContent.setCustomerInfo("rows", rows);
        responseContent.setResponseTotal(total);
        return responseContent.generateResponse();
    }


    /**
     * 添加一条库存信息
     *
     * @return 返回一个map，其中：key 为 result表示操作的结果，包括：success 与 error
     */
    @RequestMapping(value = "/stockManage/stock", method = RequestMethod.POST)
    public
    @ResponseBody
    Map<String, Object> addStockRecord(@RequestBody Map<String, Object> params) {
        // 初始化 Response
        Response responseContent = ResponseUtil.newResponseInstance();
        String isSuccess = Response.RESPONSE_RESULT_ERROR;
        boolean isAvailable = true;

        String medicineId = (String) params.get("medicineId");
        String whseId = (String) params.get("whseId");
        String stockAmount = (String) params.get("stockAmount");

        if (StringUtils.isBlank(medicineId) || !StringUtils.isNumeric(medicineId))
            isAvailable = false;
        if (StringUtils.isBlank(whseId) || !StringUtils.isNumeric(whseId))
            isAvailable = false;
        if (StringUtils.isBlank(stockAmount) || !StringUtils.isNumeric(stockAmount))
            isAvailable = false;

        if (isAvailable) {
            isSuccess = stockService.addStock(Integer.valueOf(medicineId), Integer.valueOf(whseId),
                    Integer.valueOf(stockAmount)) ? Response.RESPONSE_RESULT_SUCCESS : Response.RESPONSE_RESULT_ERROR;
        }

        // 设置 Response
        responseContent.setResponseResult(isSuccess);
        return responseContent.generateResponse();
    }

    /**
     * 更新库存信息
     *
     * @return 返回一个map，其中：key 为 result表示操作的结果，包括：success 与 error
     */
    @RequestMapping(value = "/stockManage/stock", method = RequestMethod.PUT)
    public
    @ResponseBody
    Map<String, Object> updateStockRecord(@RequestBody Map<String, Object> params) {
        // 初始化 Response
        Response responseContent = ResponseUtil.newResponseInstance();
        boolean isAvailable = true;
        String result = Response.RESPONSE_RESULT_ERROR;

        String medicineId = (String) params.get("medicineId");
        String whseId = (String) params.get("whseId");
        String stockAmount = (String) params.get("stockAmount");

        if (StringUtils.isBlank(medicineId) || !StringUtils.isNumeric(medicineId))
            isAvailable = false;
        if (StringUtils.isBlank(whseId) || !StringUtils.isNumeric(whseId))
            isAvailable = false;
        if (StringUtils.isBlank(stockAmount) || !StringUtils.isNumeric(stockAmount))
            isAvailable = false;

        if (isAvailable) {
            result = stockService.updateStock(Integer.valueOf(medicineId), Integer.valueOf(whseId),
                    Integer.valueOf(stockAmount)) ? Response.RESPONSE_RESULT_SUCCESS : Response.RESPONSE_RESULT_ERROR;
        }

        // 设置 Response
        responseContent.setResponseResult(result);
        return responseContent.generateResponse();
    }

    /**
     * 删除一条库存信息
     *
     * @return 返回一个map，其中：key 为 result表示操作的结果，包括：success 与 error
     */
    @ResponseBody
    @RequestMapping(value = "/stockManage/stock/{ids}", method = RequestMethod.DELETE)
    public Resp deleteStockRecord(@PathVariable(value = "ids") String ids) {
        try {
            if (ids.contains("-")) {
                String[] str_ids = ids.split("-");
                List<Integer> int_ids = new ArrayList<Integer>();
                for (String id : str_ids) {
                    int_ids.add(Integer.parseInt(id));
                }
                stockService.deleteStockByStockIds(int_ids);
            } else {
                Integer id = Integer.parseInt(ids);
                stockService.deleteStockByStockId(id);
            }
            return Resp.httpStatus(HttpStatus.OK, "删除库存信息成功");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.OK, "删除库存信息成功");
        }
    }

    /**
     * 查询库存信息，查询所属的仓库为session保存的信息
     *
     * @param keyword    查询关键字
     * @param searchType 查询类型
     * @param offset     分页偏移值
     * @param limit      分页大小
     * @param request    请求
     * @return 结果的一个Map，其中： key为 rows 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @SuppressWarnings("unchecked")
    @ResponseBody
    @RequestMapping(value = "/stockManage/stockList", method = RequestMethod.GET)
    public Map<String, Object> getStockList(@RequestParam(value = "keyword") String keyword,
                                            @RequestParam(value = "searchType") String searchType, @RequestParam(value = "offset") int offset,
                                            @RequestParam(value = "limit") int limit, @RequestBody HttpServletRequest request) {

        /*/{keyword}/{searchType}/{offset}/{limit}*/
        // 初始化 Response
        Response responseContent = ResponseUtil.newResponseInstance();

        List<Stock> rows = null;
        long total = 0;

        HttpSession session = request.getSession();
        Integer whseId = (Integer) session.getAttribute("warehouseBelong");
        //Integer whseId=52002;

        if (whseId != null) {
            Map<String, Object> queryResult = query(searchType, keyword, whseId.toString(), offset, limit);
            if (queryResult != null) {
                rows = (List<Stock>) queryResult.get("data");
                total = (long) queryResult.get("total");
            }
        }

        if (rows == null)
            rows = new ArrayList<>();

        // 设置 Response
        responseContent.setCustomerInfo("rows", rows);
        responseContent.setResponseTotal(total);
        return responseContent.generateResponse();
    }

}
