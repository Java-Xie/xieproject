package com.chu.xieproject;

import com.chu.xieproject.mapper.TestMapper;
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

    @Autowired
    private TestService testService;

    @Autowired
    private TestMapper testMapper;

    @Test
    void contextLoads() {
//        System.out.println("测试"+usersMapper.findAll());
//        System.out.println("测试service"+testService.login("admin","123"));
        //注册账号
//        System.out.println("测试test"+testService.register("chu2","123"));
       // System.out.println("测试userslog"+usersLogMapper.findAll());
        //测试test表
        /*com.chu.xieproject.entity.Test test = new com.chu.xieproject.entity.Test();
        test.setTest("测试2");
        test.setTestName("测试姓名2");
        try {
            testService.test(test);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(testMapper.findAll());*/
        float a = -18888888.2345f;
        a+=1E7;
        System.out.println(a);
//        char c = '灄';
//        System.out.println((int)c);
        double d = 2.1234567890123456789;
        System.out.println(d);
    }

}
