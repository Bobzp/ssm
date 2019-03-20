package com.bob.ssm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhangpeng
 * @Date: 2018/12/17 14:23
 * @Description:
 */
@Component
@Aspect
public class TestAspect {
    @Pointcut("execution(* com.bob.ssm.controller..*(..))")
    public void pointCut(){

    }
    @Before("pointCut()")
    public void befor(JoinPoint joinPoint){
        System.out.println("方法准备开始运行！");
    }
}
