package com.sqt.desgin.abstractfactory;

/**
 * @Description: 数学产品族工厂
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-27  1:29
 */
public class MathFactory implements CourseFactory{
    @Override
    public Course getCource() {
        return new MathCourse();
    }

    @Override
    public Video getVideo() {
        return new MathVideo();
    }
}
