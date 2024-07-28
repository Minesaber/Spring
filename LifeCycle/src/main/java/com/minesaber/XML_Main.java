package com.minesaber;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Minesaber
 */
public class XML_Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("XML_Main.main——————>" +
                context.getBean("com.minesaber.Student"));
    }
}
