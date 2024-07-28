package com.minesaber.demo.service.impl;

import com.minesaber.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Minesaber
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void method_1() {
        System.out.println("UserServiceImpl.method_1——————>" +
                "method_1...");
    }

    @Override
    public void method_2() {
        System.out.println("UserServiceImpl.method_2——————>" +
                "method_2...");
    }

    @Override
    public void exceptionExample() {
        throw new RuntimeException("UserServiceImpl.exceptionExample——————>" +
                "模拟运行时异常");
    }
}
