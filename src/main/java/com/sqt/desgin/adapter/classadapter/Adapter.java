package com.sqt.desgin.adapter.classadapter;

/**适配器类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:02
 */
public class Adapter extends Adaptee implements Target{

    /**
     * 调用目标方法，其实是调用被适配类的方法
     */
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
