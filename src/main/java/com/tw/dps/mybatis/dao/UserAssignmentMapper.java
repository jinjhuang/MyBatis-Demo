package com.tw.dps.mybatis.dao;

import com.tw.dps.mybatis.model.UserAssignment;

public interface UserAssignmentMapper {
    int deleteByPrimaryKey(Integer userAssignmentId);

    int insert(UserAssignment record);

    int insertSelective(UserAssignment record);

    UserAssignment selectByPrimaryKey(Integer userAssignmentId);

    int updateByPrimaryKeySelective(UserAssignment record);

    int updateByPrimaryKey(UserAssignment record);
}