package com.chu.xieproject;

import com.chu.xieproject.mapper.UsersLogMapper;
import com.chu.xieproject.mapper.UsersMapper;
import com.chu.xieproject.service.testservices.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XieprojectApplicationTests {

    @Autowired
    private UsersMapper usersMapper;

    @Autowired
    private UsersLogMapper usersLogMapper;

    /*@Autowired
    private UsersLogMapper usersLogMapper;*/

    @Autowired
    private TestService testService;

    @Test
    void contextLoads() {
//        System.out.println("测试"+usersMapper.findAll());
//        System.out.println("测试service"+testService.login("admin","123"));
        System.out.println("测试test"+testService.register("chu1","123"));
       // System.out.println("测试userslog"+usersLogMapper.findAll());
    }

}
