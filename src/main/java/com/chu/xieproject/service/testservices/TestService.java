package com.chu.xieproject.service.testservices;

public interface TestService {

    //登录
    Boolean login(String loginname, String password);

    //注册
    Boolean register(String loginname, String password);

}
