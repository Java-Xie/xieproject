package com.chu.xieproject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UsersLog {
    @Id
    //自动增长列
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer uId;
    private Integer logType;
    private Date logDate;
    private String uPwdOld;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public Date getLogDate() {
        return logDate;
    }

    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    public String getuPwdOld() {
        return uPwdOld;
    }

    public void setuPwdOld(String uPwdOld) {
        this.uPwdOld = uPwdOld;
    }
}
