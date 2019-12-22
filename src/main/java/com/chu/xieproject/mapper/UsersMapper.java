package com.chu.xieproject.mapper;

import com.chu.xieproject.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UsersMapper extends JpaRepository<Users,Integer> {

    //通过账号和密码查询用户信息
    @Query("from Users where name=?1 and pwd=?2")
    Users queryUsersNameOrPwd(String name, String pwd);

    //通过账号查询用户信息
    @Query("from Users where name=?1")
    Users queryUsersName(String name);

}
