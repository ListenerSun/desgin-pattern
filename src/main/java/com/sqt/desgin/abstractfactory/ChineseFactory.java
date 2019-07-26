package com.sqt.desgin.abstractfactory;

/**
 * @Description:语文产品族工厂
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-27  1:35
 */
public class ChineseFactory implements CourseFactory {
    @Override
    public Course getCource() {
        return new ChineseCourse();
    }

    @Override
    public Video getVideo() {
        return new ChineseVideo();
    }
}
