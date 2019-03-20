package com.bob.ssm.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import sun.applet.AppletEvent;

/**
 * @Auther: zhangpeng
 * @Date: 2018/12/17 15:28
 * @Description:
 */
@Component
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
    @Override
    public void onApplicationEvent(BlackListEvent blackListEvent) {
        System.out.println("应用事件:" + blackListEvent);
    }
}
