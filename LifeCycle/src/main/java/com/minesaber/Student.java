package com.minesaber;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Minesaber
 */
public class Student implements InitializingBean, BeanNameAware {
    private Detail detail;

    public Student() {
        System.out.println("【以下为Student的实例的生命周期】");
        System.out.println("Student.Student()——————>" +
                "无参构造方法被调用");
    }

    public void setDetail(Detail detail) {
        System.out.println("Student.setDetail——————>" +
                "依赖注入");
        this.detail = detail;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Student.setBeanName————>" +
                "BeanNameAware接口的setBeanName方法实现被调用，注入当前Bean在容器中的beanName：" + name);
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("Student.afterPropertiesSet()——————>" +
                "afterPropertiesSet方法被调用");
    }

    public void init() {
        System.out.println("Student.init()——————>" +
                "init方法被调用");
    }
}

class Detail {
    public Detail() {
        System.out.println("Detail.Detail()——————>" +
                "无参构造方法被调用，" +
                "然后依次执行该Detail实例的依赖注入、BeanPostProcessor.before、初始化方法、BeanPostProcessor.after");
    }
}
