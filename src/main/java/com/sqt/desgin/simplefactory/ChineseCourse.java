package com.sqt.desgin.simplefactory;

/**
 * @Description: 语文课程
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-23  23:08
 */
public class ChineseCourse extends Course {

    public ChineseCourse(){
        System.out.println("产生了一个语文课程!");
    }

    @Override
    Course produce() {
        return new ChineseCourse();
    }
}
