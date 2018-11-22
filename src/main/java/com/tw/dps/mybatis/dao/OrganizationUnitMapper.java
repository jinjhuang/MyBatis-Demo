package com.tw.dps.mybatis.dao;

import com.tw.dps.mybatis.model.OrganizationUnit;
import com.tw.dps.mybatis.model.OrganizationUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrganizationUnitMapper {
    int countByExample(OrganizationUnitExample example);

    int deleteByExample(OrganizationUnitExample example);

    int deleteByPrimaryKey(Integer orgUnitId);

    int insert(OrganizationUnit record);

    int insertSelective(OrganizationUnit record);

    List<OrganizationUnit> selectByExample(OrganizationUnitExample example);

    OrganizationUnit selectByPrimaryKey(Integer orgUnitId);

    int updateByExampleSelective(@Param("record") OrganizationUnit record, @Param("example") OrganizationUnitExample example);

    int updateByExample(@Param("record") OrganizationUnit record, @Param("example") OrganizationUnitExample example);

    int updateByPrimaryKeySelective(OrganizationUnit record);

    int updateByPrimaryKey(OrganizationUnit record);
}