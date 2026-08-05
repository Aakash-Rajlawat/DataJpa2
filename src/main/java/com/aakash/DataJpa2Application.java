package com.aakash;

import com.aakash.UserRepository.UserRepository;
import com.aakash.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Optional;

@SpringBootApplication
public class DataJpa2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DataJpa2Application.class, args);
        UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

        User u1 = new User(1,"Aakash","Male",20,"Nepal");
        User u2 = new User(2,"Sam","Male",40,"America");
        User u3 = new User(3,"Tom","Male",65,"Australia");

        //userRepository.saveAll(Arrays.asList(u1,u2,u3));

        Optional<User> byId = userRepository.findById(1);
        if(byId.isPresent()){
            System.out.println(byId.get());
        }
    }

}
