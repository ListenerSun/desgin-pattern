package com.sqt.desgin.bridge;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-20 2:48
 */
public class HuoQiAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new HuoQiAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期存储账户");
    }
}
