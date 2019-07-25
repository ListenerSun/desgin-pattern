package com.sqt.desgin.factorymethod;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-26  0:09
 */
public class MathBookFactory extends BookFactory {
    @Override
    public Book produce() {
        return new MathBook();
    }
}
