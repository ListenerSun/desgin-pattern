package com.sqt.desgin.chainofresponsibility;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-12-07 22:55
 */
@Slf4j
public class UserNameAccountHandler extends AccountHandler {


    @Override
    public void chainAccount(Account account) {
        if (!StringUtils.isBlank(account.getUsername())){
            log.info("账户用户名不为空,可以进入下一个审批!");
            if ( null != accountHandler){
                accountHandler.chainAccount(account);
            }
        }else {
            log.info("账户 用户名为空!审批流程结束!");
        }
    }
}
