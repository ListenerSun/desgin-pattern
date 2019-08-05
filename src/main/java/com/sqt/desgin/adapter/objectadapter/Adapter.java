package com.sqt.desgin.adapter.objectadapter;

/**对象适配器类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:02
 */
public class Adapter implements Target {

   //将被适配类组合进适配器类中来
    private Adaptee adaptee = new Adaptee();

    /**
     * 调用目标方法，其实是调用被适配类的方法
     */
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
