package com.sqt.desgin.decorator;

/**加冰的可乐装饰类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-01 1:07
 */
public class IceCocoDecorator extends AbstractDecorator{

    public IceCocoDecorator(ACoco ACoco) {
        super(ACoco);
    }

    @Override
    protected String getACoco() {

        return super.getACoco()+"加冰!，加冰之后"+doSomething();
    }

    @Override
    protected Integer cost() {
        return super.cost()+4;
    }

    @Override
    protected String doSomething() {
        return "摇晃两下";
    }
}
