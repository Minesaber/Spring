package com.minesaber.demo.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Minesaber
 */
@Component
public class MyAdvice1 {
    public void beforeAdvice() {
        System.out.println("MyAdvice1.beforeAdvice——————>" +
                "前置通知");
    }

    public void afterReturningAdvice() {
        System.out.println("MyAdvice1.afterReturningAdvice——————>" +
                "后置通知");
    }

    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("MyAdvice1.aroundAdvice——————>" +
                "环绕前通知");
        proceedingJoinPoint.proceed();
        System.out.println("MyAdvice1.aroundAdvice——————>" +
                "环绕后通知");
    }

    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception) {
        System.out.println("MyAdvice1.afterThrowingAdvice——————>" +
                "异常抛出通知，当前目标对象的信息如下：");
        System.out.println("    当前切点的表达式：" + joinPoint.getStaticPart());
        System.out.println("    目标对象：" + joinPoint.getTarget());
        System.out.println("    目标方法：" + joinPoint.getSignature());
        System.out.println("    目标方法的参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("    异常：" + exception.getMessage());
    }

    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("MyAdvice1.afterAdvice——————>" +
                "最终通知，尝试获取当前目标对象：");
        System.out.println("    " + joinPoint.getTarget());
    }
}