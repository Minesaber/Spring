package com.minesaber.demo;

import com.minesaber.demo.config.SpringConfig;
import com.minesaber.demo.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * <p>模拟AOP：使用MyAdvice1的前后置通知对UserService的method1、method2进行增强
 *
 * @author Minesaber
 */
public class Annotation_Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.getBean(UserService.class).method_1();
        context.getBean(UserService.class).method_2();
    }
}
