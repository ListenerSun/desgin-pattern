package com.sqt.desgin.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-30 0:57
 */
@Setter
@Getter
public class Person implements Cloneable{
    private String name;
    private String sex;
    /**
     * 该属性是引用类型
     */
    private Date birthday;
    private String age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", age='" + age + '\'' +
                '}'+"对象的内存地址:"+super.toString()+"对象birthday属性的内存地址:"+birthday.hashCode();
    }
}
