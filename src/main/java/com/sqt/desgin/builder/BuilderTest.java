package com.sqt.desgin.builder;

/**
 * @Description:测试类
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-28 0:49
 */
public class BuilderTest {

    public static void main(String[] args) {
        House house = new House.HouseBuilder().houseAddressBuilder("西安")
                .houseNameBuilder("大房子").houseShapeBuilder("正方形")
                .houseSizeBuilder("10层").build();
        System.out.println(house);

    }
}
