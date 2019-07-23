package com.sqt.desgin.simplefactory;


/**
 * @Description: 简单工厂模式
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-23  23:00
 */
public class CourseFactory {

    public static Course getInstance(String type){
        switch (type){
            case "chinese":
                return  new ChineseCourse();
            case "math":
                return new MathCourse();
            default:
                return null;
        }
    }
}
