package com.tw.dps.mybatis.dao;

import com.tw.dps.mybatis.model.ConsumerApp;
import com.tw.dps.mybatis.model.ConsumerAppExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConsumerAppMapper {
    int countByExample(ConsumerAppExample example);

    int deleteByExample(ConsumerAppExample example);

    int deleteByPrimaryKey(Integer appId);

    int insert(ConsumerApp record);

    int insertSelective(ConsumerApp record);

    List<ConsumerApp> selectByExample(ConsumerAppExample example);

    ConsumerApp selectByPrimaryKey(Integer appId);

    int updateByExampleSelective(@Param("record") ConsumerApp record, @Param("example") ConsumerAppExample example);

    int updateByExample(@Param("record") ConsumerApp record, @Param("example") ConsumerAppExample example);

    int updateByPrimaryKeySelective(ConsumerApp record);

    int updateByPrimaryKey(ConsumerApp record);
}