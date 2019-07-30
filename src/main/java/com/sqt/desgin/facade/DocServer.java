package com.sqt.desgin.facade;

/**
 * @Description: 医生服务
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-31 2:59
 */
public class DocServer {

    public void sendDrug(Pat pat){
        if (pat.getMoney() > 200){
            System.out.println("给患者开药!");
        }else {
            System.out.println("患者钱不够,不开药!");
        }

    }
}
