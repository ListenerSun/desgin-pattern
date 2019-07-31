package com.sqt.desgin.decorator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description: 可口可乐
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-01 0:54
 */
@Setter
@Getter
@ToString
public abstract class ACoco {

    /**获取可口可乐
     * @return
     */
    protected abstract  String getACoco();

    /**花费了多少钱
     * @return
     */
    protected abstract Integer cost();
}
