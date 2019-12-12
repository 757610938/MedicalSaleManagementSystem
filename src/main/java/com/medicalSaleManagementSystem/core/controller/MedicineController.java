package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
import com.medicalSaleManagementSystem.core.model.VO.MedicineVO;
import com.medicalSaleManagementSystem.core.model.entity.Medicine;
import com.medicalSaleManagementSystem.core.model.entity.User;
import com.medicalSaleManagementSystem.core.service.MedicineService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Msg;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.ManagedList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.medicalSaleManagementSystem.util.message.Result;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping()
public class MedicineController {
    @Autowired
    private MedicineService medicineService;

    /**
     * 增加药品信息
     * @param medicineVo
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/medicine", method = RequestMethod.POST )
    @ResponseBody
    public Resp addMedicine(@RequestBody MedicineVO medicineVo){
        try{
            MedicineDTO medicineDTO=new MedicineDTO();
            BeanUtilEx.copyProperties(medicineDTO,medicineVo);//转化实体类
            int i = medicineService.insertSelective(medicineDTO);//调用service方法存入药品信息
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"增加药品信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"增加药品信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /**
     * 通过id查找药品信息
     * @param id
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/medicine/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Resp findMedicineById(@PathVariable Integer id){
        System.out.println("传入id--->"+id);
        try{
            MedicineDTO medicineDTO = medicineService.selectByPrimaryKey(id);
            if(medicineDTO==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找药品信息失败");
            }
            MedicineVO medicineVO = new MedicineVO();
            BeanUtilEx.copyProperties(medicineVO,medicineDTO);
            Map<String, Object> ext = new HashMap<>();
            ext.put("medicineVO", medicineVO);
            return Resp.httpStatus(HttpStatus.OK,"查找药品信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /**
     * 通过药品名称查找药品信息
     * @param name
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/medicine/findName", method = RequestMethod.GET)
    @ResponseBody
    public Resp findMedicineByName(String name){
        try{
            List<Medicine> medicineList = medicineService.selectByPrimaryName(name);
            if(medicineList.size() == 0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找药品信息失败");
            }
            Map<String, Object> ext = new HashMap<>();
            ext.put("medicineList", medicineList);
            return Resp.httpStatus(HttpStatus.OK,"查找药品信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /**
     * 通过药品名称模糊查找药品信息
     * @param name
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/medicines/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Resp vagueFindMedicineByName(@PathVariable String name){
        System.out.println("传入name--->"+name);
        try{
            List<Medicine> medicineList = medicineService.vagueFindMedicineByName(name);
            if(medicineList.size() == 0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找药品信息失败");
            }
            //设置现在的页数为1，显示的条数为5条
            PageHelper.startPage(1, 5);
            PageInfo<Medicine> page  = new PageInfo<>(medicineList);
            Map<String, Object> ext = new HashMap<>();
            ext.put("page", page);
            return Resp.httpStatus(HttpStatus.OK,"查找药品信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /**
     * 通过id删除药品信息
     * @param medicineId
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/medicine/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Resp deleteMedicineById(Integer medicineId){
        try{
            int i = medicineService.deleteByPrimaryKey(medicineId);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"删除药品信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"删除药品信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    @RequestMapping ( value = "/medicine", method = RequestMethod.PUT )
    @ResponseBody
    public Resp updateMedicine(@RequestBody MedicineVO medicineVO){
        try{
            MedicineDTO medicineDTO=new MedicineDTO();
            BeanUtilEx.copyProperties(medicineDTO,medicineVO);//转化实体类
            int i = medicineService.updateByPrimaryKeySelective(medicineDTO);//调用service方法更新药品信息
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"更新药品信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"更新药品信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /**
     * 查询所有药品信息
     * @param
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/medicine", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll( ){
        try{
            //设置现在的页数为1，显示的条数为5条
            PageHelper.startPage(1, 5);
            List<Medicine> medicineList = medicineService.getAll();
            PageInfo<Medicine> page  = new PageInfo<>(medicineList);
            return Resp.httpStatus(HttpStatus.OK,"查找药品信息成功！",page);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
