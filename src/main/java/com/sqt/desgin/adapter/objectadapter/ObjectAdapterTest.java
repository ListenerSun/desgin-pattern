package com.sqt.desgin.adapter.objectadapter;


/**对象适配器demo
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:03
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.request();
        Target target1 = new Adapter();
        target1.request();
    }
}
