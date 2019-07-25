package com.sqt.desgin.factorymethod;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-26  0:10
 */
public class ChineseBookFactory extends BookFactory {
    @Override
    public Book produce() {
        return new ChineseBook();
    }
}
