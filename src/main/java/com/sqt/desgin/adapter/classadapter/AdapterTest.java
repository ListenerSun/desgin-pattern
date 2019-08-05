package com.sqt.desgin.adapter.classadapter;

/**类适配器demo
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:03
 */
public class AdapterTest {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.request();
        Target target1 = new Adapter();
        target1.request();
    }
}
