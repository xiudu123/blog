package com.xiudu.blog.dao;

import com.xiudu.blog.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 锈渎 on 2023/5/29 23:24
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
