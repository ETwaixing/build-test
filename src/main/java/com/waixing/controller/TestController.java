package com.waixing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * Created by yonglang on 2017/8/4.
 */
@RestController
@RequestMapping(value = "/")
public class TestController {

    /**
     * 测试控制器
     */
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(){
        return "Jenkins自动化构建 整合测试";
    }

}
