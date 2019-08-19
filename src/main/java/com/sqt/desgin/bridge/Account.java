package com.sqt.desgin.bridge;

/** 账户接口类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-20 2:46
 */
public interface Account {

    /**打开账户
     * @return
     */
    Account openAccount();

    /**
     * 展示账户类型
     */
    void showAccountType();
}
