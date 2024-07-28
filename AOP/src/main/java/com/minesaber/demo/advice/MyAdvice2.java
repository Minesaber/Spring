package com.minesaber.demo.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Minesaber
 */
public class MyAdvice2 implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println("MyAdvice2.before——————>" +
                "前置通知");
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("MyAdvice2.afterReturning——————>" +
                "后置通知");
    }
}
