package com.sqt.desgin.adapter;

/**电源适配器 测试类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:19
 */
public class PowerAdapterTest {

    public static void main(String[] args) {
        DC5V dc5V = new PowerAdapter();
        dc5V.outPut5V();
    }
}
