package com.chu.xieproject;

import com.chu.xieproject.mapper.UsersMapper;
import com.chu.xieproject.service.testservices.TestService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XieprojectApplicationTests {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
        System.out.println("测试"+usersMapper.findAll());
        System.out.println("测试service"+testService.Login("admin","admin"));
    }

}
