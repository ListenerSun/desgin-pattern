package com.sqt.desgin.decorator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2019-08-01 1:27
 */
@Setter
@Getter
@ToString
public class Coco extends ACoco {
    @Override
    protected String getACoco() {
        return "可乐";
    }

    @Override
    protected Integer cost() {
        return 4;
    }
}
