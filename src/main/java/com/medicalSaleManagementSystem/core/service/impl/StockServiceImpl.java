package com.medicalSaleManagementSystem.core.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hazelcast.map.impl.recordstore.Storage;
import com.medicalSaleManagementSystem.core.dao.MedicineMapper;
import com.medicalSaleManagementSystem.core.dao.StockMapper;
import com.medicalSaleManagementSystem.core.dao.WarehouseMapper;
import com.medicalSaleManagementSystem.core.model.BO.StockBo;
import com.medicalSaleManagementSystem.core.model.entity.*;
import com.medicalSaleManagementSystem.core.service.StockService;
import com.medicalSaleManagementSystem.util.LoggerUtils;
import com.medicalSaleManagementSystem.util.message.Msg;
import org.apache.ibatis.exceptions.PersistenceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;
    @Autowired
    private MedicineMapper medicineMapper;
    @Autowired
    private WarehouseMapper warehouseMapper;

    /**
     * 返回所有的库存记录
     *
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectAll(Integer whseId) {
        return selectAll(whseId, -1, -1);
    }

    /**
     * 分页返回所有的库存记录
     *
     * @param offset 分页偏移值
     * @param limit  分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectAll(Integer whseId, int offset, int limit) {

        // 初始化结果集
        Map<String, Object> resultSet = new HashMap<>();

        long total = 0;
        boolean isPagination = true;
        List<StockBo> stockBoList = new ArrayList<>();
        // validate
        if (offset < 0 || limit < 0)
            isPagination = false;

        // query

        try {
            if (isPagination) {
                PageHelper.offsetPage(offset, limit);
                stockBoList = stockMapper.selectAllAndWhseId(whseId);
                if (stockBoList != null) {
                    PageInfo<StockBo> pageInfo = new PageInfo<>(stockBoList);
                    total = pageInfo.getTotal();
                    for (StockBo stock : stockBoList) {
                        System.out.println(stock);
                    }
                }
            } else {
                stockBoList = stockMapper.selectAllAndWhseId(whseId);
                if (stockBoList != null)
                    total = stockBoList.size();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        resultSet.put("data", stockBoList);
        resultSet.put("total", total);
        System.out.println(resultSet);
        return resultSet;
    }


    /**
     * 返回指定药品ID的库存记录
     *
     * @param medicineId 指定的药品ID
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectByMedicineID(Integer medicineId, Integer whseId) {
        return selectByMedicineID(medicineId, whseId, -1, -1);
    }

    /**
     * 分页返回指定的药品库存记录
     *
     * @param medicineId 指定的药品ID
     * @param offset     分页偏移值
     * @param limit      分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectByMedicineID(Integer medicineId, Integer whseId, int offset, int limit) {
        // 初始化结果集
        Map<String, Object> resultSet = new HashMap<>();
        List<StockBo> stockBoList = new ArrayList<>();
        long total = 0;
        boolean isPagination = true;

        // validate
        if (offset < 0 || limit < 0)
            isPagination = false;

        // query
        try {
            if (isPagination) {
                PageHelper.offsetPage(offset, limit);
                stockBoList = stockMapper.selectByMedicineIdAndWhseId(medicineId, whseId);
                if (stockBoList != null) {
                    PageInfo<StockBo> pageInfo = new PageInfo<>(stockBoList);
                    total = pageInfo.getTotal();
                    for (StockBo stock : stockBoList) {
                        System.out.println(stock);
                    }
                } else
                    stockBoList = new ArrayList<>();
            } else {
                stockBoList = stockMapper.selectByMedicineIdAndWhseId(medicineId, whseId);
                if (stockBoList != null)
                    total = stockBoList.size();
                else
                    stockBoList = new ArrayList<>();
            }
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

        resultSet.put("data", stockBoList);
        resultSet.put("total", total);
        return resultSet;
    }

    /**
     * 返回指定药品名称的库存记录
     *
     * @param medicineName 药品名称
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectByMedicineName(String medicineName, Integer whseId) {
        return selectByMedicineName(medicineName, whseId, -1, -1);
    }

    /**
     * 分页返回指定药品名称的库存记录
     *
     * @param medicineName 药品名称
     * @param offset       分页偏移值
     * @param limit        分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectByMedicineName(String medicineName, Integer whseId, int offset, int limit) {
        // 初始化结果集
        Map<String, Object> resultSet = new HashMap<>();
        List<StockBo> stockList = new ArrayList<>();
        long total = 0;
        boolean isPagination = true;

        // validate
        if (offset < 0 || limit < 0)
            isPagination = false;

        // query
        try {
            if (isPagination) {
                PageHelper.offsetPage(offset, limit);
                stockList = stockMapper.selectByMedicineNameAndWhseId(medicineName, whseId);
                if (stockList != null) {
                    PageInfo<StockBo> pageInfo = new PageInfo<>(stockList);
                    total = pageInfo.getTotal();
                    for (StockBo stock : stockList) {
                        System.out.println(stock);
                    }
                } else
                    stockList = new ArrayList<>();
            } else {
                stockList = stockMapper.selectByMedicineNameAndWhseId(medicineName, whseId);
                if (stockList != null)
                    total = stockList.size();
                else
                    stockList = new ArrayList<>();
            }
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

        resultSet.put("data", stockList);
        resultSet.put("total", total);
        return resultSet;
    }

    /**
     * 返回指定药品种类的库存记录
     *
     * @param medicineCategory 指定的药品种类
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectByMedicineCategory(String medicineCategory, Integer whseId) {
        return selectByMedicineCategory(medicineCategory, whseId, -1, -1);
    }

    /**
     * 分页返回指定药品种类的库存记录
     *
     * @param medicineCategory 指定的药品种类
     * @param offset           分页偏移值
     * @param limit            分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    @Override
    public Map<String, Object> selectByMedicineCategory(String medicineCategory, Integer whseId, int offset, int limit) {
        // 初始化结果集
        Map<String, Object> resultSet = new HashMap<>();
        List<StockBo> stockList = new ArrayList<>();
        long total = 0;
        boolean isPaginatin = true;

        // validate
        if (offset < 0 || limit < 0)
            isPaginatin = false;

        // query
        try {
            if (isPaginatin) {
                PageHelper.offsetPage(offset, limit);
                stockList = stockMapper.selectByMedicineCategoryAndWhseId(medicineCategory, whseId);
                if (stockList != null) {
                    PageInfo<StockBo> pageInfo = new PageInfo<>(stockList);
                    total = pageInfo.getTotal();
                    for (StockBo stock : stockList) {
                        System.out.println(stock);
                    }
                } else
                    stockList = new ArrayList<>();
            } else {
                stockList = stockMapper.selectByMedicineCategoryAndWhseId(medicineCategory, whseId);
                if (stockList != null)
                    total = stockList.size();
                else
                    stockList = new ArrayList<>();
            }
        } catch (PersistenceException e) {
            e.printStackTrace();
        }

        resultSet.put("data", stockList);
        resultSet.put("total", total);
        return resultSet;
    }

    /**
     * 添加一条库存记录
     *
     * @param medicineId  指定的药品ID
     * @param whseId      指定的仓库ID
     * @param stockAmount 库存数量
     * @return 返回一个boolean值，值为true代表更新成功，否则代表失败
     */
    @Override
    public boolean addStock(Integer medicineId, Integer whseId, Integer stockAmount) {
        try {
            boolean isAvailable = true;

            // validate
            Medicine medicine = medicineMapper.selectById(medicineId);
            Warehouse warehouse = warehouseMapper.selectByID(whseId);
            if (medicine == null)
                isAvailable = false;
            if (warehouse == null)
                isAvailable = false;
            if (stockAmount < 0)
                isAvailable = false;
            List<StockBo> stockList = stockMapper.selectByMedicineIdAndWhseId(medicineId, whseId);
            if (!(stockList != null && stockList.isEmpty()))
                isAvailable = false;

            if (isAvailable) {
                // insert
                Stock stock = new Stock();
                stock.setMedicineId(medicineId);
                stock.setWhseId(whseId);
                stock.setStockAmount(stockAmount);
                stockMapper.insert(stock);
            }

            return isAvailable;
        } catch (PersistenceException e) {
            e.printStackTrace();
            return false;
        }

    }

    /**
     * 更新一条库存记录
     *
     * @param medicineId  指定的药品ID
     * @param whseId      指定的仓库ID
     * @param stockAmount 更新的库存数量
     * @return 返回一个boolean值，值为true代表更新成功，否则代表失败
     */
    @Override
    public boolean updateStock(Integer medicineId, Integer whseId, Integer stockAmount) {
        try {
            boolean isUpdate = false;

            // validate
            List<StockBo> stockList = stockMapper.selectByMedicineIdAndWhseId(medicineId, whseId);
            if (stockList != null && !stockList.isEmpty()) {
                if (stockAmount >= 0) {
                    // update
                    StockBo stock = stockList.get(0);
                    stock.setStockAmount(stockAmount);
                    stockMapper.update(stock);
                    isUpdate = true;
                }
            }

            return isUpdate;
        } catch (PersistenceException e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public boolean storageIncrease(Integer medicineId, Integer whseId, Integer stockAmount) {
        return false;
    }

    @Override
    public boolean storageDecrease(Integer medicineId, Integer whseId, Integer stockAmount) {
        return false;
    }


    /**
     * 删除一条库存记录
     * 药品ID与仓库ID可唯一确定一条库存记录
     *
     * @param medicineId 指定的药品ID
     * @param whseId     指定的仓库ID
     * @return 返回一个boolean值，值为true代表更新成功，否则代表失败
     */
    @Override
    public boolean deleteStock(Integer medicineId, Integer whseId) {
        try {
            boolean isDelete = false;

            // validate
            List<StockBo> stockList = stockMapper.selectByMedicineIdAndWhseId(medicineId, whseId);
            if (stockList != null && !stockList.isEmpty()) {
                // delete
                stockMapper.deleteByWhseIdAndMedicineId(medicineId, whseId);
                isDelete = true;
            }

            return isDelete;
        } catch (PersistenceException e) {
            return false;
        }
    }

    @Override
    public Map<String, Object> importStorage(MultipartFile file) {
        return null;
    }

    @Override
    public File exportStorage(List<Storage> storages) {
        return null;
    }

    @Override
    public Msg deleteStockByStockId(Stock stock) {
        stockMapper.deleteByPrimaryKey(stock.getStockId());
        try {
            return Msg.success();
        } catch (Exception e) {
            LoggerUtils.error(StockServiceImpl.class, "删除成功", e);
            return Msg.fail("删除失败");
        }
    }

    @Override
    public int deleteStockByStockId(Integer stockId) {
        return stockMapper.deleteByPrimaryKey(stockId);
    }

    @Override
    public void deleteStockByStockIds(List<Integer> ids) {

        StockExample stockExample =new StockExample();
        StockExample.Criteria criteria =stockExample.createCriteria();
        criteria.andStockIdIn(ids);
        stockMapper.deleteByExample(stockExample);

    }
}
