package com.sqt.desgin.chainofresponsibility;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 账户 审批 抽象类
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-07 22:50
 */
@Setter
@Getter
public abstract class AccountHandler {

    protected AccountHandler accountHandler;
    /**
     * 审批账户
     * @param account
     */
    public abstract void chainAccount(Account account);
}
