package com.sqt.desgin.flyweight;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-09 1:51
 */
public class FlyWeightTest {

    public static void main(String[] args) {

        String[] strArr = {"西安","长沙","成都","北京","上海"};

        for (int i = 0; i < 10; i++){
            People people = PeopleFactory.getPeopleManager(strArr[(int) (Math.random()*strArr.length)]);
            people.sing();
        }
//        System.out.println(Math.random());
    }
}
