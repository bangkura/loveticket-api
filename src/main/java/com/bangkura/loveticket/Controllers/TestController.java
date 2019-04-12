package com.bangkura.loveticket.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Bangkura
 * @create: 2019-04-12 14:37
 **/
@RestController
@RequestMapping("/")
public class TestController {
    @RequestMapping("test")
    public String sayHello() {
        return "hello";
    }
}
