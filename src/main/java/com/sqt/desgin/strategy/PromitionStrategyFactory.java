package com.sqt.desgin.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 促销策略工厂
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-10 1:35
 */
public class PromitionStrategyFactory {
    private static Map<String,PromitionStrategy> strategyMap = new HashMap<>();
    static {
        strategyMap.put("LIJIAN",new LiJianPromition());
        strategyMap.put("FANXIAN",new FanXianPromition());
    }

    private  PromitionStrategyFactory (){

    }
    public static  PromitionStrategy getByPromitionKey(String promitionKey){
        return strategyMap.get(promitionKey) == null ? new EmptyPromition() : strategyMap.get(promitionKey);
    }
}
