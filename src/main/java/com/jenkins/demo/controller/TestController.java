package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author 13006
 * @Date 2019/10/24 13:41
 **/
@RestController
public class TestController {

    @GetMapping("str")
    public String getStr() {
        return "good luck";
    }
}
