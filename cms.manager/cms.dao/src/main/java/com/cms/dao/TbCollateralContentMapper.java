package com.cms.dao;

import com.cms.pojo.TbCollateralContent;
import com.cms.pojo.TbCollateralContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCollateralContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    long countByExample(TbCollateralContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int deleteByExample(TbCollateralContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int insert(TbCollateralContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int insertSelective(TbCollateralContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    List<TbCollateralContent> selectByExample(TbCollateralContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    TbCollateralContent selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbCollateralContent record, @Param("example") TbCollateralContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int updateByExample(@Param("record") TbCollateralContent record, @Param("example") TbCollateralContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int updateByPrimaryKeySelective(TbCollateralContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_collateral_content
     *
     * @mbg.generated Wed Jun 20 21:40:08 CST 2018
     */
    int updateByPrimaryKey(TbCollateralContent record);
}