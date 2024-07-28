package com.minesaber.pojo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Minesaber
 */
@Component("user")
@Scope("singleton")
@Lazy(false)
@Profile("dev")
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;

    public User() {
        System.out.println("User.User——————>" +
                "反射调用无参构造方法，实例化对象\n\t" +
                getCallerInfo());
    }

    private String getCallerInfo() {
        // 获取当前线程的堆栈跟踪信息
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        // 跳过前3个元素：getStackTrace(), getCallerInfo(), 构造方法
        for (int i = 3; i < stackTrace.length; i++) {
            StackTraceElement element = stackTrace[i];
            sb.append("\t") // 添加制表符
                    .append(element.getClassName())
                    .append(".")
                    .append(element.getMethodName())
                    .append(" (Line: ")
                    .append(element.getLineNumber())
                    .append(")")
                    .append("\n");
        }
        return sb.toString().trim();
    }

    @Autowired
    public void di(ApplicationContext context) {
        System.out.println("User.di——————>" +
                "依赖注入");
    }

    @PostConstruct
    public void init() {
        System.out.println("User.init——————>" +
                "初始化方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("User.destroy——————>" +
                "容器关闭前执行销毁方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}