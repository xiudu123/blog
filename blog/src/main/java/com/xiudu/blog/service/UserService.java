package com.xiudu.blog.service;

import com.xiudu.blog.pojo.User;

public interface UserService {

    User checkUser(String username, String password);
}
