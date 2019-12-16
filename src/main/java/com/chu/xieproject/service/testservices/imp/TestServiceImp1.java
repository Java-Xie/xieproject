package com.chu.xieproject.service.testservices.imp;

import com.chu.xieproject.entity.Users;
import com.chu.xieproject.entity.UsersLog;
import com.chu.xieproject.mapper.UsersLogMapper;
import com.chu.xieproject.mapper.UsersMapper;
import com.chu.xieproject.service.testservices.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TestServiceImp1 implements TestService {

    private final UsersMapper usersMapper;
    private final UsersLogMapper usersLogMapper;

    @Autowired
    public TestServiceImp1(UsersMapper usersMapper,UsersLogMapper usersLogMapper) {
        this.usersMapper = usersMapper;
        this.usersLogMapper = usersLogMapper;
    }

    @Override
    public Boolean login(String loginname,String password) {
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

    @Override
    public Boolean register(String loginname, String password) {
        //添加用户信息
        Users users = new Users();
        users.setName(loginname);
        users.setPwd(password);
        users.setId(5);
        Users usersNew = usersMapper.save(users);
        //添加用户日志信息
        UsersLog usersLog = new UsersLog();
        usersLog.setuId(usersNew.getId());
        usersLog.setLogType(0);
        usersLog.setLogDate(new Date());
        usersLog.setId(2);
        usersLogMapper.save(usersLog);
        return true;
    }
}
