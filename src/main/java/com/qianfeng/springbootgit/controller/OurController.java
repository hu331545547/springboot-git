package com.qianfeng.springbootgit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author husong
 * @Date 2019/6/5
 */
@Controller
@RequestMapping("/our")
public class OurController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("hello");
        System.out.println("dev......");
        return "hello";
    }
}
