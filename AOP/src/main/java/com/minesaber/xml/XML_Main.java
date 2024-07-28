package com.minesaber.xml;

import com.minesaber.demo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>测试：使用MyAdvice1对UserService的method1、method2、exceptionExample进行增强
 *
 * @author Minesaber
 */
public class XML_Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.method_1();
        System.out.println();
        userService.method_2();
        System.out.println();
        userService.exceptionExample();
    }
}
