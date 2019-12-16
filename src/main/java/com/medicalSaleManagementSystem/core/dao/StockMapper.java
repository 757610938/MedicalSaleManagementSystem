package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.BO.StockBo;
import com.medicalSaleManagementSystem.core.model.entity.Stock;
import com.medicalSaleManagementSystem.core.model.entity.StockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockMapper {
    long countByExample(StockExample example);

    int deleteByExample(StockExample example);

    int deleteByPrimaryKey(Integer stockId);

    //int insert(Stock record);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(Integer stockId);

    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);


    /**
     * 选择所有的库存信息
     * @return 返回所有的库存信息
     */
    List<StockBo> selectAllAndWhseId(@Param("whseId") Integer whseId);

    /**
     * 选择指定药品ID和仓库ID的库存信息
     * @param medicineId 药品ID
     * @param whseId 库存ID
     * @return 返回所有指定药品ID和仓库ID的库存信息
     */
    List<StockBo> selectByMedicineIdAndWhseId(@Param("medicineId") Integer medicineId,
                                                 @Param("whseId") Integer whseId);

    /**
     * 选择指定药品名的库存信息
     * @param medicineName 药品名称
     * @return 返回所有指定药品名称的库存信息
     */
    List<StockBo> selectByMedicineNameAndWhseId(@Param("medicineName") String medicineName,
                                                   @Param("whseId") Integer whseId);

    /**
     * 选择指定药品种类的库存信息
     * @param medicineCategory 药品种类
     * @return 返回所有指定货物类型的库存信息
     */
    List<StockBo> selectByMedicineCategoryAndWhseId(@Param("medicineType") String medicineCategory,
                                                   @Param("whseId") Integer whseId);

    /**
     * 更新库存信息
     * 该库存信息必需已经存在于数据库当中，否则更新无效
     * @param stock 库存信息
     */
    void update(StockBo stock);

    /**
     * 插入新的库存信息
     * @param stock 库存信息
     */
    void insert(Stock stock);

    /**
     * 批量导入库存信息
     * @param stock 若干条库存信息
     */
    void insertBatch(List<StockBo> stock);

    /**
     * 删除指定药品ID的库存信息
     * @param medicineId 药品ID
     */
    void deleteByMedicineId(Integer medicineId);

    /**
     * 删除指定仓库的库存信息
     * @param whseId 仓库ID
     */
    void deleteByWhseId(Integer whseId);

    /**
     * 删除指定仓库中的指定药品的库存信息
     * @param medicineId 药品ID
     * @param whseId 仓库ID
     */
    void deleteByWhseIdAndMedicineId(@Param("medicineId") Integer medicineId, @Param("whseId") Integer whseId);
}