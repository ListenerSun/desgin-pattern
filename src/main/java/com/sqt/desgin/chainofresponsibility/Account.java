package com.sqt.desgin.chainofresponsibility;

/**
 * @Description: 账户类
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-07 22:52
 */
public class Account {

    /**
     * 用户名
     */
    private String username;
    /**
     * 身份证
     */
    private String idenNo;
    /**
     * 密码
     */
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIdenNo() {
        return idenNo;
    }

    public void setIdenNo(String idenNo) {
        this.idenNo = idenNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
