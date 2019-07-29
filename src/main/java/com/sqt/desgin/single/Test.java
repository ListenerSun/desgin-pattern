package com.sqt.desgin.single;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-29 0:46
 */
public class Test {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"-----"+instance);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance = Singleton.getInstance();
                System.out.println(Thread.currentThread().getName()+"-----"+instance);
            }
        }).start();
    }
}
