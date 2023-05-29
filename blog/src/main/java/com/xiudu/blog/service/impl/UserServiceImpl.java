package com.xiudu.blog.service.impl;

import com.xiudu.blog.dao.UserRepository;
import com.xiudu.blog.pojo.User;
import com.xiudu.blog.service.UserService;
import com.xiudu.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: 锈渎
 * @date: 2023/5/29 23:20
 * @code: 面向对象面向君， 不负代码不负卿。
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password)) ;
        return user;
    }
}
