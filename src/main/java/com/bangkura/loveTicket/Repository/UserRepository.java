package com.bangkura.loveTicket.Repository;

import com.bangkura.loveTicket.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @description:
 * @author: Bangkura
 * @create: 2019-04-15 11:49
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);

    User findByAge(Integer age);

    @Query("from User u where u.name=:name")
    User findUser(@Param("name") String name);
}
