package com.sqt.desgin.facade;

/**
 * @Description:  患者端服务
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-31 2:56
 */
public class PatServer {

    public Boolean isMoneyFull(Pat pat){
        Boolean flag = false;
        if (pat.getMoney() > 10){
            System.out.println("给患者看病");
            flag = true;
        }else {
            System.out.println("患者钱不够,不能看病!");
        }

        return  flag;
    }
}
