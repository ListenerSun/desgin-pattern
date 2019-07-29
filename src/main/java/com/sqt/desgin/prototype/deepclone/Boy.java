package com.sqt.desgin.prototype.deepclone;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Description: 深克隆前克隆问题
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-30 1:25
 */
@Setter
@Getter
public class Boy implements Cloneable{
    private String name;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Boy cloneBoy = (Boy) super.clone();
        //浅克隆:不重写birthDay属性的clone(),boy1和boy2中birthDay变量引用的同一个内存地址
        //深克隆:重写birthDay属性的clone(),boy1和boy2中birthDay变量引用的不同的内存地址
        cloneBoy.birthday = (Date) cloneBoy.getBirthday().clone();
        return cloneBoy;
    }



    public static void main(String[] args) throws CloneNotSupportedException {
        Boy boy = new Boy();
        boy.setName("小孙");
        boy.setBirthday(new Date(0L));
        //浅克隆:不重写birthDay属性的clone(),boy1和boy2中birthDay变量引用的同一个内存地址
        //深克隆:重写birthDay属性的clone(),boy1和boy2中birthDay变量引用的不同的内存地址
        Boy boy1 = (Boy) boy.clone();
        Boy boy2 = (Boy)boy.clone();
        boy1.setBirthday(new Date(777777777L));
        System.out.println("boy1:"+boy1);
        System.out.println("boy1:"+boy2);
    }

    @Override
    public String toString() {
        return "Boy{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}
