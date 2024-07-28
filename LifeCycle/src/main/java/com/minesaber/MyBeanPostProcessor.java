package com.minesaber;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author Minesaber
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student)
            System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization——————>" +
                    "每个Bean初始化方法执行之前被调用");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student)
            System.out.println("MyBeanPostProcessor.postProcessAfterInitialization——————>" +
                    "每个Bean初始化方法执行之后被调用");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
