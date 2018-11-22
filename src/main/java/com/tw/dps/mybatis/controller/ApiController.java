package com.tw.dps.mybatis.controller;

import com.tw.dps.mybatis.dao.ApiMapper;
import com.tw.dps.mybatis.model.Api;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ApiController {
    @Resource
    ApiMapper apiMapper;

    public Api getApiById(int id){
        return apiMapper.selectByPrimaryKey(id);
    }
}
