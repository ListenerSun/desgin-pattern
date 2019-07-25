package com.sqt.desgin.simplefactory;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-23  23:10
 */

public class MathCourse extends Course {
    public MathCourse(){
        System.out.println("生产了一个数学课程!");
    }

    @Override
    Course produce() {
        return new MathCourse();
    }
}
