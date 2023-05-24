/**
 * @author: 锈渎
 * @date: 2023/5/24 9:33
 * @code: 面向对象面向君， 不负代码不负卿。
 * @description:
 */
package com.xiudu.blog.web;

import com.xiudu.blog.handler.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id, @PathVariable String name){
//        int i = 9/0;
//        String blog = null;
//        if(blog == null){
//            throw  new NotFoundException("博客不存在");
//        }
        System.out.println("----------index--------------");
        return "index";
    }
}
