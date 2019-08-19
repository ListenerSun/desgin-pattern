package com.sqt.desgin.bridge;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-20 2:50
 */
public abstract class Bank {

    Account account;

    public Bank(Account account){
        this.account = account;
    }

    /**打开账户
     * @return
     */
    abstract  Account openAccount();
}
