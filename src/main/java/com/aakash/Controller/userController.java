package com.aakash.Controller;

import com.aakash.DataJpa2Application;
import com.aakash.UserRepository.JpaUserRepository;
import com.aakash.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {


    private JpaUserRepository jpaUserRepository;
    @Autowired
    public void setJpaUserRepository(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @RequestMapping("/userData")
    public List<User> userData(){

        return jpaUserRepository.findAll();

    }


}
