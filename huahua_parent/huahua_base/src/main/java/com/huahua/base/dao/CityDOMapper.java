package com.huahua.base.dao;

import com.huahua.base.dto.CityDO;
import com.huahua.base.dto.CityDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    long countByExample(CityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int deleteByExample(CityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int insert(CityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int insertSelective(CityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    List<CityDO> selectByExample(CityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    CityDO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") CityDO record, @Param("example") CityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int updateByExample(@Param("record") CityDO record, @Param("example") CityDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int updateByPrimaryKeySelective(CityDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_city
     *
     * @mbg.generated Thu Apr 11 14:58:54 CST 2019
     */
    int updateByPrimaryKey(CityDO record);
}