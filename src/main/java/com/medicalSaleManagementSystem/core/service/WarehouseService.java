package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.util.message.Msg;
import com.medicalSaleManagementSystem.util.message.Resp;

import java.util.List;

public interface WarehouseService {

    /**
     * 通过仓库Id查询仓库
     * @param whseId
     * @return
     */
    Warehouse findWhseByWhseId(Integer whseId);

    Resp findWhseById(WarehouseVO warehouseVO);


    /**
     * 模糊搜索仓库,并分页展示
     * @param key
     * @param pageNum
     * @param pageSize
     * @return
     */
    Resp findWhseByFuzzySearch(String key, Integer pageNum,Integer pageSize);

    Resp findWhseById(Integer whseId);

    List<Warehouse> findAllWarehouse();

    /**
     * 查询所有的药品信息，以列表形式展示
     * @return
     */
    Msg WarehouseList(String orderby, Integer page);

    /**
     * 新增仓库
     * @param warehouse
     * @return
     */
    void addWhse(Warehouse warehouse);

    /**
     * 根据仓库Id删除仓库
     * @param warehouse
     * @return
     */
    Msg deleteWhseByWhseId(Warehouse warehouse);

    /**
     *
     * @param whseId
     * @return
     */
    int deleteWhseByWhseId(Integer whseId);

    /**
     * 批量删除仓库
     * @param ids
     */
    void deleteWhseByWhseIds(List<Integer> ids);

    /**
     * 更新仓库信息
     * @param warehouseVO
     * @return
     */
    Resp updateWhse(WarehouseVO warehouseVO);



}
