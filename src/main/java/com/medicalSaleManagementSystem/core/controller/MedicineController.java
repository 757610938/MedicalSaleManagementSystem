//package com.medicalSaleManagementSystem.core.controller;
//
//import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
//import com.medicalSaleManagementSystem.core.model.POJO.Medicine;
//import com.medicalSaleManagementSystem.core.model.VO.MedicineVo;
//import com.medicalSaleManagementSystem.core.service.MedicineService;
//import com.medicalSaleManagementSystem.util.BeanUtilEx;
//import com.medicalSaleManagementSystem.util.message.Msg;
//import com.medicalSaleManagementSystem.util.TypeCastHelper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import com.medicalSaleManagementSystem.util.message.Result;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
//@Controller
//@RequestMapping(value = "/medicine")
//public class MedicineController {
//    @Autowired
//    private MedicineService medicineService;
//
//    /**
//     * 增加药品信息
//     * @param medicineVo
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "/add", method = RequestMethod.POST )
//    @ResponseBody
//    public Result addMedicine(@RequestBody MedicineVo medicineVo){
//        MedicineDTO medicineDTO=new MedicineDTO();
//        BeanUtilEx.copyProperties(medicineDTO,medicineVo);//转化实体类
//        Msg msg = medicineService.registerMedicine(medicineDTO);//调用service方法存入药品信息
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        return result;
//    }
//    /**
//     * 通过id查找药品信息
//     * @param medicineId
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "/findId", method = RequestMethod.GET)
//    @ResponseBody
//    public Result findMedicineById(String medicineId){
//        Msg msg = medicineService.findMedicineById(TypeCastHelper.toInt(medicineId));
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        result.setMessage(msg.getMsg());//设置返回消息
//        if (msg.getCode()==200){
//            result.setData(msg.getExt().get("medicine"));
//        }
//        return result;
//    }
//    /**
//     * 通过药品名称查找药品信息
//     * @param medicineName
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "/findName", method = RequestMethod.GET)
//    @ResponseBody
//    public Result findMedicineByName(String medicineName){
//        Msg msg = medicineService.findMedicineByName(medicineName);
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        result.setMessage(msg.getMsg());//设置返回消息
//        if (msg.getCode()==200){
//            result.setData(msg.getExt().get("medicine"));
//        }
//        return result;
//    }
//    /**
//     * 通过药品名称模糊查找药品信息
//     * @param vagueName
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "/vagueFind", method = RequestMethod.GET)
//    @ResponseBody
//    public Result vagueFindMedicineByName(String vagueName){
//        Msg msg = medicineService.vagueFindMedicineByName(vagueName);
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        result.setMessage(msg.getMsg());//设置返回消息
//        List<Medicine> medicineList= (List<Medicine>) msg.getExt().get("medicineList");
//        if (msg.getCode()==200){
//            result.setData(medicineList);//返回药品list集合
//        }
//        return result;
//    }
//    /**
//     * 通过id删除药品信息
//     * @param medicineId
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "/deleteMedicineId", method = RequestMethod.GET)
//    @ResponseBody
//    public Result deleteMedicineById(String medicineId){
//        Msg msg = medicineService.deleteMedicineById(TypeCastHelper.toInt(medicineId));
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        result.setMessage(msg.getMsg());//设置返回消息
//        return result;
//    }
//
//    @RequestMapping ( value = "/update", method = RequestMethod.POST )
//    @ResponseBody
//    public Result updateMedicine(@RequestBody MedicineVo medicineVo){
//        MedicineDTO medicineDTO=new MedicineDTO();
//        BeanUtilEx.copyProperties(medicineDTO,medicineVo);//转化实体类
//        Msg msg = medicineService.updateMedicine(medicineDTO);//调用service方法更新药品信息
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        return result;
//    }
//    /**
//     * 查询所有药品信息
//     * @param
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "/findAll", method = RequestMethod.GET)
//    @ResponseBody
//    public Result findAllMedicine(){
//        Msg msg = medicineService.findAllMedicine();
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        result.setMessage(msg.getMsg());//设置返回消息
//        List<Medicine> medicineList= (List<Medicine>) msg.getExt().get("medicineList");
//        if (msg.getCode()==200){
//            result.setData(medicineList);//返回药品list集合
//        }
//        return result;
//    }
//}
