package com.bob.ssm.event;

import org.springframework.context.ApplicationEvent;

/**
 * @Auther: zhangpeng
 * @Date: 2018/12/17 15:21
 * @Description:
 */
public class BlackListEvent extends ApplicationEvent {
    public BlackListEvent(Object source) {
        super(source);
    }
}
