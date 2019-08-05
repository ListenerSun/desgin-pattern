package com.sqt.desgin.adapter.objectadapter;


/**目标类的实现类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:01
 */
public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("目标类的方法!");
    }
}
