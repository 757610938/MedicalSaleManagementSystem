package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.util.message.Msg;

public interface WarehouseService {

    /**
     * 通过仓库Id查询仓库
     * @param whseId
     * @return
     */
    Msg findWhseByWhseId(Integer whseId);

    /**
     * 通过仓库名查找仓库
     * @param whseName
     * @return
     */
    Msg findWhseByWhseName(String whseName);

    /**
     * 通过仓库地址查找仓库
     * @param whseAddress
     * @return
     */
    Msg findWhseByWhseAddress(String whseAddress);
}
