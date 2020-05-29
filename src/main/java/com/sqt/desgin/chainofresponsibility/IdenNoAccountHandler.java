package com.sqt.desgin.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-07 22:59
 */
@Slf4j
public class IdenNoAccountHandler extends AccountHandler {
    @Override
    public void chainAccount(Account account) {
        if (StringUtils.isNotBlank(account.getIdenNo())){
            log.info("身份证号不为空!该账户符合要求!");
            if (accountHandler != null){
                accountHandler.chainAccount(account);
            }
        }else {
            log.info("身份证号为空！该账户不能通过!");
        }
    }
}
