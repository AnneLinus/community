package com.zbx.community.service;

import com.zbx.community.dao.UserMapper;
import com.zbx.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * description: UserService <br>
 * date: 2020/4/21 20:51 <br>
 * author: Anne <br>
 * version: 1.0 <br>
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public User findUserById(int id) {
        return userMapper.selectById(id);
    }
}
