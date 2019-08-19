package com.sqt.desgin.bridge;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-20 2:50
 */
public class SiQiAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开死期账户!");
        return new SiQiAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个死期账户!");

    }
}
