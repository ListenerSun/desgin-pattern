package com.sqt.desgin.strategy;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-10 1:39
 */
public class EmptyPromition implements PromitionStrategy {
    @Override
    public void doPromition() {
        System.out.println("无促销活动!");
    }
}
