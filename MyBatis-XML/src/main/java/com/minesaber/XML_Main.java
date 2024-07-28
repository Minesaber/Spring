package com.minesaber;

import com.minesaber.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Minesaber
 */
public class XML_Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("com.minesaber.service.impl.UserServiceImpl");
        System.out.println(userService.selectByUsername("Minesaber"));
    }
}
