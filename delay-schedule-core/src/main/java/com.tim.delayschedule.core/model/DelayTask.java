package com.tim.delayschedule.core.model;

import lombok.Data;

/**
 * @author xiaobing
 * @date 2020/1/8
 */
@Data
public class DelayTask {
    /**
     * id task的唯一标识
     */
    private String id;
    /**
     * task类型
     */
    private String type;
    /**
     * 执行task需要的参数体
     */
    private String payload;

    /**
     * task发布时间
     */
    private Long publishTime;

    /**
     * task计划执行时间
     */
    private Long shceduleTime;

    /**
     * task实际执行时间
     */
    private Long executeTime;

    /**
     * task完成时间
     */
    private Long finishedTime;
}
