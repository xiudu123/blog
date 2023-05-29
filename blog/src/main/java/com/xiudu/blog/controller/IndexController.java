/**
 * @author: 锈渎
 * @date: 2023/5/24 9:33
 * @code: 面向对象面向君， 不负代码不负卿。
 * @description:
 */
package com.xiudu.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
//        int i = 9/0;
//        String blog = null;
//        if(blog == null){
//            throw  new NotFoundException("博客不存在");
//        }
        return "index";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/archives")
    public String archives(){
        return "archives";
    }
    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }
    @GetMapping("/message")
    public String message(){
        return "message";
    }
    @GetMapping("/types")
    public String types(){
        return "types";
    }
    @GetMapping("/404")
    public String To404(){
        return "./error/404";
    }
    @GetMapping("/500")
    public String To500(){
        return "./error/500";
    }
}
