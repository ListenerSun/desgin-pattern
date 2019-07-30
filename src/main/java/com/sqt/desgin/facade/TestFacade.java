package com.sqt.desgin.facade;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-31 3:06
 */
public class TestFacade {

    public static void main(String[] args) {
        Pat pat = new Pat();
        pat.setMoney(300);
        PatFacade patFacade = new PatFacade();
        patFacade.patExchange(pat);
    }
}
