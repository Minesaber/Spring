package com.minesaber.service.impl;

import com.minesaber.mapper.UserMapper;
import com.minesaber.pojo.User;
import com.minesaber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Minesaber
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
