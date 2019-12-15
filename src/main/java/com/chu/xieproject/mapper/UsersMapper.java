package com.chu.xieproject.mapper;

import com.chu.xieproject.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsersMapper extends JpaRepository<Users,Integer> {

    //自定义方法：负责的sql语句
    @Query("from Users where name=?1 and pwd=?2")
    Users queryUsersNameOrPwd(String name, String pwd);

    @Query("from Users where name=?1")
    Users queryUsersName(String name);

}
