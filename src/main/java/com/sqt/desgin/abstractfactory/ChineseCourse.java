package com.sqt.desgin.abstractfactory;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-27  1:31
 */
public class ChineseCourse extends Course{
    @Override
    void produce() {
        System.out.println("生产了一个语文课程!");
    }
}
