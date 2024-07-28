package com.minesaber.demo.processor;

import com.minesaber.demo.advice.MyAdvice1;
import com.minesaber.demo.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

/**
 * @author Minesaber
 */
@Component
public class MockAOPBeanPostProcessor implements BeanPostProcessor, ApplicationContextAware {
    private ApplicationContext context;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof UserService) {
            Object beanProxy = Proxy.newProxyInstance(
                    MockAOPBeanPostProcessor.class.getClassLoader(),
                    bean.getClass().getInterfaces(),
                    (proxy, method, args) -> {
                        MyAdvice1 myAdvice = context.getBean(MyAdvice1.class);
                        myAdvice.beforeAdvice();
                        Object result = method.invoke(bean);
                        myAdvice.afterReturningAdvice();
                        return result;
                    }
            );
            return beanProxy;
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }
}
