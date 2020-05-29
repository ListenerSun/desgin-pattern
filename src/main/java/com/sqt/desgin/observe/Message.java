package com.sqt.desgin.observe;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

/**
 * @Description: 被观察的消息
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-12 0:46
 */
@Setter
@Getter
public class Message extends Observable {



    /**通知消息
     * @param personProduce
     * @param message
     */
    public void produceMessage(PersonProduce personProduce,String message){
        System.out.println(personProduce.getName()+"发布了一个消息，消息内容:"+message);
        setChanged();
        notifyObservers(message);
    }

}
