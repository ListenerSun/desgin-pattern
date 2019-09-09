package com.sqt.desgin.strategy;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-10 1:42
 */
public class StrategyTest {
    public static void main(String[] args) {
        String promitionKey = "LIJIAN";
        //双十一活动
        //使用工厂模式 消除了 if  else 判断，相当于在工厂中进行了判断
        PromitionActivity promitionActivity1111 =
                new PromitionActivity(PromitionStrategyFactory.getByPromitionKey(promitionKey));
        promitionActivity1111.excutePromitionStrategy();
    }
}
