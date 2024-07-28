package com.minesaber.service.impl;

import com.minesaber.mapper.UserMapper;
import com.minesaber.pojo.User;
import com.minesaber.service.UserService;

/**
 * @author Minesaber
 */
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        return userMapper.selectByUsername(username);
    }
}
