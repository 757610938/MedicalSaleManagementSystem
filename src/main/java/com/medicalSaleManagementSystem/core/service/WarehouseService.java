package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.util.message.Msg;

import java.util.List;

public interface WarehouseService {

    /**
     * 通过仓库Id查询仓库
     * @param whseId
     * @return
     */
    Warehouse findWhseByWhseId(Integer whseId);


    /**
     * 模糊搜索仓库,并分页展示
     * @param key
     * @param orderBy
     * @param page
     * @return
     */
    Msg findWhseByFuzzySearch(String key,String orderBy,Integer page);

    /**
     * 查询所有的药品信息，以列表形式展示
     * @return
     */
    List<Warehouse> findAllWhse();

    /**
     * 新增仓库
     * @param warehouse
     * @return
     */
    Msg addWhse(Warehouse warehouse);

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
     *
     * @param ids
     */
    void deleteWhseByWhseIds(List<Integer> ids);

    /**
     * 更新仓库信息
     * @param warehouse
     * @return
     */
    Msg updateWhse(Warehouse warehouse);



}
