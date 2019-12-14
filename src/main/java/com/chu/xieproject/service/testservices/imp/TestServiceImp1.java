package com.chu.xieproject.service.testservices.imp;

import com.chu.xieproject.entity.Users;
import com.chu.xieproject.mapper.UsersMapper;
import com.chu.xieproject.service.testservices.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImp1 implements TestService {

    private final UsersMapper usersMapper;

    @Autowired
    public TestServiceImp1(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public Boolean Login(String loginname,String password) {
        List list = usersMapper.findAll();
        System.out.println(list);
        Users user = usersMapper.queryUsersNameOrPwd(loginname,password);
        System.out.println(user);
        if ("admin".equals(loginname)&&"123".equals(password)){
            System.out.println(loginname+"---"+password);
            return true;
        }
        System.out.println(loginname+"---"+password);
        return false;
    }
}
