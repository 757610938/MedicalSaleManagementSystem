package com.medicalSaleManagementSystem.core.service;

import com.hazelcast.map.impl.recordstore.Storage;
import com.medicalSaleManagementSystem.core.model.entity.Stock;
import com.medicalSaleManagementSystem.util.message.Msg;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;
import java.util.Map;

public interface StockService {

    /**
     * 返回所有的库存记录
     *
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectAll(Integer whseId);

    /**
     * 分页返回所有的库存记录
     *
     * @param offset 分页偏移值
     * @param limit  分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectAll(Integer whseId, int offset, int limit);

    /**
     * 返回指定药品ID的库存记录
     *
     * @param medicineId 指定的药品ID
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectByMedicineID(Integer medicineId, Integer whseId);

    /**
     * 分页返回指定的药品库存记录
     *
     * @param medicineId 指定的药品ID
     * @param offset  分页偏移值
     * @param limit   分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectByMedicineID(Integer medicineId, Integer whseId, int offset, int limit);

    /**
     * 返回指定药品名称的库存记录
     *
     * @param medicineName 药品名称
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectByMedicineName(String medicineName, Integer whseId);

    /**
     * 分页返回指定药品名称的库存记录
     *
     * @param medicineName 药品名称
     * @param offset    分页偏移值
     * @param limit     分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectByMedicineName(String medicineName, Integer whseId, int offset, int limit);

    /**
     * 返回指定药品种类的库存记录
     *
     * @param medicineCategory 指定的药品种类
     * @return 结果的一个Map，其中： key为 data的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectByMedicineCategory(String medicineCategory, Integer whseId);

    /**
     * 分页返回指定药品种类的库存记录
     *
     * @param medicineCategory 指定的药品种类
     * @param offset    分页偏移值
     * @param limit     分页大小
     * @return 结果的一个Map，其中： key为 data 的代表记录数据；key 为 total 代表结果记录的数量
     */
    Map<String, Object> selectByMedicineCategory(String medicineCategory, Integer whseId, int offset, int limit);

    /**
     * 添加一条库存记录
     *
     * @param medicineId      指定的药品ID
     * @param whseId 指定的仓库ID
     * @param stockAmount       库存数量
     * @return 返回一个boolean值，值为true代表更新成功，否则代表失败
     */
    boolean addStock(Integer medicineId, Integer whseId, Integer stockAmount);

    /**
     * 更新一条库存记录
     *
     * @param medicineId      指定的药品ID
     * @param whseId 指定的仓库ID
     * @param stockAmount       更新的库存数量
     * @return 返回一个boolean值，值为true代表更新成功，否则代表失败
     */
    boolean updateStock(Integer medicineId, Integer whseId, Integer stockAmount);

    /**
     * 为指定的药品库存记录增加指定数目
     *
     * @param medicineId      药品ID
     * @param whseId 仓库ID
     * @param stockAmount       增加的数量
     * @return 返回一个 boolean 值，若值为true表示数目增加成功，否则表示增加失败
     */
    boolean storageIncrease(Integer medicineId, Integer whseId, Integer stockAmount);

    /**
     * 为指定的药品库存记录减少指定的数目
     *
     * @param medicineId      药品ID
     * @param whseId 仓库ID
     * @param stockAmount       减少的数量
     * @return 返回一个 boolean 值，若值为 true 表示数目减少成功，否则表示增加失败
     */
    boolean storageDecrease(Integer medicineId, Integer whseId, Integer stockAmount);

    /**
     * 删除一条库存记录
     * 货物ID与仓库ID可唯一确定一条库存记录
     *
     * @param medicineId      指定的货物ID
     * @param whseId 指定的仓库ID
     * @return 返回一个boolean值，值为true代表更新成功，否则代表失败
     */
    boolean deleteStock(Integer medicineId, Integer whseId);

    /**
     * 导入库存记录
     *
     * @param file 保存有的库存记录的文件
     * @return 返回一个Map，其中：key为total代表导入的总记录数，key为available代表有效导入的记录数
     */
    Map<String, Object> importStorage(MultipartFile file);

    /**
     * 导出库存记录
     *
     * @param storages 保存有库存记录的List
     * @return excel 文件
     */
    File exportStorage(List<Storage> storages);

    Msg deleteStockByStockId(Stock stock);

    int deleteStockByStockId(Integer stockId);

    void deleteStockByStockIds(List<Integer> ids);

}
