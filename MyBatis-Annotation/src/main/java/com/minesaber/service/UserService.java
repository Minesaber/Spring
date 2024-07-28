package com.minesaber.service;

import com.minesaber.pojo.User;

/**
 * </p>用户服务
 *
 * @author Minesaber
 */
public interface UserService {
    User selectByUsername(String username);
}
