package com.minesaber.mapper;

import com.minesaber.pojo.User;

/**
 * @author Minesaber
 */
public interface UserMapper {
    User selectByUsername(String username);
}
