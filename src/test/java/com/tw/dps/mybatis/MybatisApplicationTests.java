package com.tw.dps.mybatis;

import com.tw.dps.mybatis.controller.ApiController;
import com.tw.dps.mybatis.model.Api;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

	@Resource
	ApiController apiController;

	@Test
	public void contextLoads() {
		Api api = apiController.getApiById(1);
		System.out.println(">>>>>>>>>>>>>>>>>>"+api.getApiName());
		assertNotNull(api);
	}

}
