package com.sqt.desgin.adapter;

/**被适配类  将220V电流适配成5V
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:14
 */
public class ACC220 {
    public int outPut220V(){
        int out = 220;
        System.out.println("原始输出电流"+out+"V");
        return out;
    }
}
