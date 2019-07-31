package com.sqt.desgin.decorator;

/**抽象的 可乐装饰类
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-01 1:03
 */
//也可以不使用抽象,具体业务场景具体分析
public abstract class AbstractDecorator extends ACoco {

    /**
     * 被装饰的抽象可乐对象
     */
    private ACoco ACoco;

    public AbstractDecorator(ACoco ACoco){
        this.ACoco = ACoco;
    }

    @Override
    protected String getACoco() {
        return this.ACoco.getACoco();
    }

    @Override
    protected Integer cost() {
        return this.ACoco.cost();
    }

    /**
     * 装饰不同对象时不同的需要处理的业务
     */
    protected abstract String doSomething();
}
