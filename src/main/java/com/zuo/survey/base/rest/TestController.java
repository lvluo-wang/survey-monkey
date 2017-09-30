package com.zuo.survey.base.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zuo on 2017/9/30.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping(value= "hello")
    @ResponseBody
    public String test(){
        System.out.print("hello");
        return "hello";
    }
}
