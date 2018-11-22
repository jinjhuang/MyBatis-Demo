package com.tw.dps.mybatis.dao;

import com.tw.dps.mybatis.model.Api;
import com.tw.dps.mybatis.model.ApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiMapper {
    int countByExample(ApiExample example);

    int deleteByExample(ApiExample example);

    int deleteByPrimaryKey(Integer apiId);

    int insert(Api record);

    int insertSelective(Api record);

    List<Api> selectByExample(ApiExample example);

    Api selectByPrimaryKey(Integer apiId);

    int updateByExampleSelective(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByExample(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByPrimaryKeySelective(Api record);

    int updateByPrimaryKey(Api record);
}