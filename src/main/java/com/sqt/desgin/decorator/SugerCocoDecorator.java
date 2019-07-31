package com.sqt.desgin.decorator;

/**加糖的可乐装饰类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-01 1:24
 */
public class SugerCocoDecorator extends AbstractDecorator{
    public SugerCocoDecorator(ACoco ACoco) {
        super(ACoco);
    }

    @Override
    protected String getACoco() {
        return super.getACoco()+"加糖!";
    }

    @Override
    protected Integer cost() {
        return super.cost()+3;
    }

    @Override
    protected String doSomething() {
        return null;
    }
}
