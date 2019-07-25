package com.sqt.desgin.factorymethod;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-26  0:11
 */
public class TestFactoryMethod {

    public static void main(String[] args) {
        BookFactory factory = new ChineseBookFactory();
        Book chineseBook = factory.produce();
        chineseBook.produce();
        BookFactory factory2 = new MathBookFactory();
        Book mathBook = factory2.produce();
        mathBook.produce();
    }
}
