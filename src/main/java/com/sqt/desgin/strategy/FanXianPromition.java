package com.sqt.desgin.strategy;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-10 1:27
 */
public class FanXianPromition implements PromitionStrategy {
    @Override
    public void doPromition() {
        System.out.println("返现活动!");
    }
}
