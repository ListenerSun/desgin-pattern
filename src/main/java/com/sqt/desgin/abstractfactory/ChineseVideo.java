package com.sqt.desgin.abstractfactory;

/**
 * @Description: 语文视频类
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-27  1:33
 */
public class ChineseVideo extends Video {
    @Override
    public void produce() {
        System.out.println("生产了一个语文视频!");
    }
}
