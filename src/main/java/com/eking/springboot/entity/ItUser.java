package com.eking.springboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "it_user")
public class ItUser {
    /**
     * 登录ID
     */
    @Id
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 姓名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "PASSWD")
    private String passwd;

    /**
     * 密码设定时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 员工ID
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 出生日期
     */
    @Column(name = "BIRTHDAY")
    private Date birthday;

    /**
     * 系统用户标志
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 创建人
     */
    @Column(name = "PHONE")
    private String phone;

    /**
     * 更新人
     */
    @Column(name = "HOBBY")
    private String hobby;

    /**
     * 获取登录ID
     *
     * @return USER_ID - 登录ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置登录ID
     *
     * @param userId 登录ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取姓名
     *
     * @return USER_NAME - 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置姓名
     *
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return PASSWD - 密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置密码
     *
     * @param passwd 密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 获取密码设定时间
     *
     * @return CREATE_TIME - 密码设定时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置密码设定时间
     *
     * @param createTime 密码设定时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取员工ID
     *
     * @return ADDRESS - 员工ID
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置员工ID
     *
     * @param address 员工ID
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取出生日期
     *
     * @return BIRTHDAY - 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置出生日期
     *
     * @param birthday 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取系统用户标志
     *
     * @return EMAIL - 系统用户标志
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置系统用户标志
     *
     * @param email 系统用户标志
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取创建人
     *
     * @return PHONE - 创建人
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置创建人
     *
     * @param phone 创建人
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取更新人
     *
     * @return HOBBY - 更新人
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * 设置更新人
     *
     * @param hobby 更新人
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}