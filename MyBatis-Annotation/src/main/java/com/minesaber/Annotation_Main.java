package com.minesaber;

import com.minesaber.config.SpringConfig;
import com.minesaber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Minesaber
 */
public class Annotation_Main {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "dev");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = (UserService) context.getBean("userServiceImpl");
        System.out.println("Annotation_Main.main——————>" +
                userService.selectByUsername("Minesaber"));
        context.close();
    }
}
