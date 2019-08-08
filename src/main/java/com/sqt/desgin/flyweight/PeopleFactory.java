package com.sqt.desgin.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 获取享元(人)对象的工厂
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-09 1:39
 */
public class PeopleFactory {

    /**
     * 根据不同的业务场景设置 不同的map类型，线程安全考虑ConcurrentHashMap
     */
    private static final Map<String,People> peopleMap = new HashMap();

    public static People getPeopleManager(String city){
        PeopleManager peopleManager = (PeopleManager) peopleMap.get(city);
        if (peopleManager == null){
            peopleManager = new PeopleManager(city);
            System.out.print("创建家乡:"+city);
            String songName = city+"的人唱歌";
            peopleManager.setSongName(songName);
            System.out.println("    创建歌曲详情："+songName);
            peopleMap.put(city,peopleManager);
        }
        return peopleManager;
    }
}
