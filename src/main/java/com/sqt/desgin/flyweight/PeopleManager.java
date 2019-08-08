package com.sqt.desgin.flyweight;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 使用很频繁的具体对象
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-09 1:36
 */
@Setter
@Getter
public class PeopleManager implements People{

    /**
     * 外部状态
     */
    private String city;
    private String songName;

    public PeopleManager(String city) {
        this.city = city;
    }

    @Override
    public void sing() {
        System.out.println(songName);
    }
}
