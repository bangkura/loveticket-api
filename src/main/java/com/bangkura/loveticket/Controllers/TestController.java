package com.bangkura.loveticket.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Bangkura
 * @create: 2019-04-12 14:37
 **/
@RestController
public class TestController {
    @RequestMapping("/")
    public String sayHello() {
        return "hello";
    }
}
