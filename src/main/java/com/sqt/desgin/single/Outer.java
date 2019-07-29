package com.sqt.desgin.single;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-29 0:36
 */
public class Outer {
    private Outer() {
        System.out.println("outer instance create");
    }

    static {
        System.out.println("outer init");
    }

    public static void main(String[] args) {
        System.out.println("outer main execute");
//                Outer outer = Inner.outer;
    }

    private static class Inner {
        static {
            System.out.println("inner init");
        }

        private static final Outer outer = new Outer();
    }
}