package com.minesaber.demo.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Minesaber
 */
public class MyAdvice3 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MyAdvice3.invoke——————>" +
                "环绕前通知");
        Object res = invocation.getMethod().invoke(invocation.getThis(), invocation.getArguments());
        System.out.println("MyAdvice3.invoke——————>" +
                "环绕后通知");
        return res;
    }
}
