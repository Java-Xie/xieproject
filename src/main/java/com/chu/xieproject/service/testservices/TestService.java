package com.chu.xieproject.service.testservices;

import com.chu.xieproject.entity.Test;

public interface TestService {

    //登录
    Boolean login(String loginname, String password);

    //注册
    Boolean register(String loginname, String password);

    //测试test表
    void test(Test test);

}
