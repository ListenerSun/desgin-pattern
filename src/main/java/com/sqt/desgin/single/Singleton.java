package com.sqt.desgin.single;

/**
 * @Description: 静态内部类实现单例并且懒加载
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-29 0:45
 */
public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }
}