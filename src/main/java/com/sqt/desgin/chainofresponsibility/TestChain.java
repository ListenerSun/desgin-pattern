package com.sqt.desgin.chainofresponsibility;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-07 22:55
 */
public class TestChain {

    public static void main(String[] args) {
        Account account = new Account();
        account.setIdenNo("11111");
//        account.setUsername("ListenerSun");
        AccountHandler userNameHandler = new UserNameAccountHandler();
        AccountHandler IdenHandler = new IdenNoAccountHandler();
        userNameHandler.setAccountHandler(IdenHandler);
        userNameHandler.chainAccount(account);
    }
}
