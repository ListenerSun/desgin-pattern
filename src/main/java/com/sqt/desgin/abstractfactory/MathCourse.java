package com.sqt.desgin.abstractfactory;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-27  1:30
 */
public class MathCourse extends Course{

    @Override
    void produce() {
        System.out.println("生产了一个数学课程");
    }
}
