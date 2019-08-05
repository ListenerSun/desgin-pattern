package com.sqt.desgin.adapter;

/**电源适配器 将220V是配成5V
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-06 1:17
 */
public class PowerAdapter implements DC5V{

    private ACC220 acc220 = new ACC220();
    @Override
    public int outPut5V() {
        int outPut5V = acc220.outPut220V()/4;
        System.out.println("使用PowerAdapter适配之后输入电压为:"+outPut5V+"V");
        return outPut5V;
    }
}
