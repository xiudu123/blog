package com.xiudu.blog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 锈渎
 * @date: 2023/5/30 0:18
 * @code: 面向对象面向君， 不负代码不负卿。
 * @description:
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @GetMapping("/blogs")
    public String blogs(){
        return "admin/blogs-manage";
    }
}
