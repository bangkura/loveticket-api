package com.bangkura.loveTicket.Controllers;

import com.bangkura.loveTicket.Model.ResourceNotFoundException;
import com.bangkura.loveTicket.Model.User;
import com.bangkura.loveTicket.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @description:
 * @author: Bangkura
 * @create: 2019-04-12 14:37
 **/
@RestController
public class TestController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/sayhello")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("uid") Long uid) {
         Optional<User> userOptional = userRepository.findById(uid);
         if(!userOptional.isPresent())
             throw new ResourceNotFoundException();
         return userOptional.get();
    }
}
