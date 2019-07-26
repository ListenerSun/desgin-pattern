package com.sqt.desgin.abstractfactory;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-27  1:36
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        //数学产品族工厂，,用工厂接口来接返回值。
        CourseFactory mathFactory = new MathFactory();
        Course mathCourse = mathFactory.getCource();
        Video mathVideo = mathFactory.getVideo();
        mathCourse.produce();
        mathVideo.produce();
        //语文产品族工厂,用工厂接口来接返回值。
        CourseFactory chineseFactory = new ChineseFactory();
        //语文产品，用抽象类来接返回值
        Course chineseCourse = chineseFactory.getCource();
        chineseCourse.produce();
        Video chineseVideo = chineseFactory.getVideo();
        chineseVideo.produce();

    }
}
