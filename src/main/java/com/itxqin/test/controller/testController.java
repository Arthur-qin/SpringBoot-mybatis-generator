package com.itxqin.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 秦梓青
 * @create 2018/07/17  上午10:36
 **/
@RestController
@CrossOrigin
public class testController {


    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
