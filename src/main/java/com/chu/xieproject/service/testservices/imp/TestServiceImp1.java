package com.chu.xieproject.service.testservices.imp;

import com.chu.xieproject.entity.Test;
import com.chu.xieproject.entity.Users;
import com.chu.xieproject.entity.UsersLog;
import com.chu.xieproject.mapper.TestMapper;
import com.chu.xieproject.mapper.UsersLogMapper;
import com.chu.xieproject.mapper.UsersMapper;
import com.chu.xieproject.service.testservices.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class TestServiceImp1 implements TestService {

    private final UsersMapper usersMapper;
    private final UsersLogMapper usersLogMapper;
    private final TestMapper testMapper;

    @Autowired
    public TestServiceImp1(UsersMapper usersMapper, UsersLogMapper usersLogMapper, TestMapper testMapper) {
        this.usersMapper = usersMapper;
        this.usersLogMapper = usersLogMapper;
        this.testMapper = testMapper;
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
        if (usersMapper.queryUsersName(loginname)!=null){
            return false;
        }
        //添加用户信息
        Users users = new Users();
        users.setName(loginname);
        users.setPwd(password);
        Users usersNew = usersMapper.save(users);
        //添加用户日志信息
        UsersLog usersLog = new UsersLog();
        usersLog.setuId(usersNew.getId());
        usersLog.setLogType(0);
        usersLog.setLogDate(new Date());
        usersLogMapper.save(usersLog);
        return true;
    }

    @Override
    @Transactional
    public void test(Test test) {
        testMapper.save(test);
//        if ( 1/0 == 1 ){ } 测试事务
        Test testnew = new Test();
        testnew.setTest(test.getTest()+"new");
        testnew.setTestName(test.getTestName()+"new");
        testMapper.save(testnew);
    }
}
