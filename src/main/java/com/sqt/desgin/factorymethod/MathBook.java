package com.sqt.desgin.factorymethod;

/**
 * @Description:
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-26  0:06
 */
public class MathBook extends Book{

    @Override
    public void produce() {
        System.out.println("生产了一本数学书");
    }
}
