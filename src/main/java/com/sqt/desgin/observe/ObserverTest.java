package com.sqt.desgin.observe;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-12 1:17
 */
public class ObserverTest {

    public static void main(String[] args) {
        Message message = new Message();
        message.addObserver(new PersonListener("孙庆天"));
        message.produceMessage(new PersonProduce("米总"),"要放假了");
    }
}
