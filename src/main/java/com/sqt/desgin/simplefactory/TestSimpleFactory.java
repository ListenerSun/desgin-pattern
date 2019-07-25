package com.sqt.desgin.simplefactory;

import java.sql.Driver;

/**
 * @Description: 简单工厂测试类
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-23  23:11
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        //不用依赖具体的课程实现类
        Course course = CourseFactory.getInstance("chinese");
        Course course1 = CourseFactory.getInstance("math");
//        Driver driver = Class.forName("");
    }
}
