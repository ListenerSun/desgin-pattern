package com.sqt.desgin.facade;

/**
 * @Description: 患者的门面模式 类
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-07-31 3:03
 */
public class PatFacade {

    private PatServer patServer = new PatServer();

    private  DocServer docServer = new DocServer();

    /** 处理患者的门面接口
     * @param pat
     */
    public void patExchange(Pat pat){
        if (patServer.isMoneyFull(pat)){
            docServer.sendDrug(pat);
        }
    }
}
