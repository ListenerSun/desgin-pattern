package com.sqt.desgin.abstractfactory;

/**
 * @Description: 工厂接口
 * @author: sqt(男 ， 未婚) 微信:810548252
 * @Date: Created in 2019-07-26  23:21
 */
public interface CourseFactory {

    /**生产课程产品
     * @return
     */
    Course getCource();

    /**生产课程视频
     * @return
     */
    Video getVideo();
}
