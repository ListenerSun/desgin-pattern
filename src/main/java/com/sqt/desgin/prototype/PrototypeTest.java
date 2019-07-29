package com.sqt.desgin.prototype;

import java.util.Date;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-30 1:04
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        //需要创建 10个不同的张三
        //v1 版本 new 10个对象
//        for (int i = 0; i < 10; i++){
//            Person person = new Person();
//            person.setAge(""+i);
//            person.setBirthday(new Date(0L));
//            person.setName("张三"+i);
//            person.setSex("男");
//            PersonBuilder.buildPerson(person);
//        }

        /**
         * v2版本。解决了重复创建对象的问题。
         * 但是这个版本克隆出来的人的birthday引用的是一个对象
         */
        Person person = new Person();
        for (int i = 0; i < 10; i++){
            Person clonePerson = (Person)person.clone();
            clonePerson.setAge(""+i);
            clonePerson.setBirthday(new Date(0L));
            clonePerson.setName("张三"+i);
            clonePerson.setSex("男");
            PersonBuilder.buildPerson(clonePerson);
        }
    }
}
