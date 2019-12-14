package com.chu.xieproject.entity;

import javax.persistence.*;

@Entity//声明这是一个实体
@Table(name="users")//当类名和表名不一致的情况下写
public class Users {
    @Id
    @Column(name="u_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uId;
    @Column(name="u_name")
    private String uName;
    @Column(name="u_true_name")
    private String uTrueName;
    @Column(name="u_password")
    private String uPassword;
    @Column(name="u_roleid")
    private Integer uRoleid;
    /*
    * 一对多   多对一  自学成才
    * */
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuTrueName() {
        return uTrueName;
    }

    public void setuTrueName(String uTrueName) {
        this.uTrueName = uTrueName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuRoleid() {
        return uRoleid;
    }

    public void setuRoleid(Integer uRoleid) {
        this.uRoleid = uRoleid;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uTrueName='" + uTrueName + '\'' +
                ", uPassword='" + uPassword + '\'' +
                ", uRoleid=" + uRoleid +
                '}';
    }
}