package com.waixing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试类
 *
 * Created by yonglang on 2017/8/25.
 */
@RestController
@RequestMapping(value = "/")
public class TestController {

    @RequestMapping(value = "test.json",method = RequestMethod.GET)
    public String test(){
        return "success";
    }

}
