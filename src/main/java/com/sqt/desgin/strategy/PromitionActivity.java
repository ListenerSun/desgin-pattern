package com.sqt.desgin.strategy;

/**
 * @Description: 促销活动类
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-10 1:33
 */
public class PromitionActivity {
    private PromitionStrategy promitionStrategy;

    public PromitionActivity(PromitionStrategy promitionStrategy) {
        this.promitionStrategy = promitionStrategy;
    }

    public void excutePromitionStrategy(){
        promitionStrategy.doPromition();
    }
}
