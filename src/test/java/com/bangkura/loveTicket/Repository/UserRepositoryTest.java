package com.bangkura.loveTicket.Repository;

import com.bangkura.loveTicket.Model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

/**
 * @description:
 * @author: Bangkura
 * @create: 2019-04-15 11:51
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Table(name = "User")
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testAdd() {
    }
}
