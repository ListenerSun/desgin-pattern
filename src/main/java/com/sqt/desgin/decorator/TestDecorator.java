package com.sqt.desgin.decorator;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-01 1:26
 */
public class TestDecorator {

    public static void main(String[] args) {
        ACoco coco = new Coco();
        coco = new SugerCocoDecorator(coco);
        coco = new SugerCocoDecorator(coco);
        coco = new IceCocoDecorator(coco);
        System.out.println(coco.getACoco()+"===>消费了"+coco.cost()+"元");
    }
}
