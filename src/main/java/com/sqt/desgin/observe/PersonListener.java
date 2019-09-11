package com.sqt.desgin.observe;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: 被通知的人 观察者
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-09-12 1:02
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonListener implements Observer {

    private String name;

    @Override
    public void update(Observable o, Object arg) {
        Message message = (Message) o;
        String text = (String) arg;
        System.out.println(name+"收到了一条消息，消息内容:"+text);
    }
}
