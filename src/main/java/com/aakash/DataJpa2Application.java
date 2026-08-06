package com.aakash;

import com.aakash.UserRepository.UserRepository;
import com.aakash.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DataJpa2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DataJpa2Application.class, args);
        UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);

        User u1 = new User(1,"Aakash","Male",20,"Nepal");
        User u2 = new User(2,"Sam","Male",40,"America");
        User u3 = new User(3,"Tom","Male",65,"Australia");
        User u4 = new User(4,"Jerry","Male",35,"Australia");

        /*userRepository.saveAll(Arrays.asList(u1,u2,u3,u4));
*/
        /*Optional<User> byId = userRepository.findById(1);
        if(byId.isPresent()){
            System.out.println(byId.get());
        }*/

        /*Iterable<User> findAllById = userRepository.findAllById(Arrays.asList(1,2,3));
        findAllById.forEach(user -> {
            System.out.println(user);
        });*/

        /*Iterable<User> all = userRepository.findAll();
        all.forEach(user -> {
            System.out.println(user);
        });*/

     /*   long count = userRepository.count();
        System.out.println("The number of records in database : "+count);

        boolean existsById = userRepository.existsById(9);
        System.out.println(existsById);*/

        /*userRepository.deleteById(3);*/

       /* List<User> australia = userRepository.findByCountry("Australia");
        australia.forEach(user -> {
            System.out.println(user);
        });*/

     /*   List<User> userByAge = userRepository.findUserByAge(30);
        userByAge.forEach(user -> {
            System.out.println(user);
        });

     */

        /*List<User> greaterThan = userRepository.findUserByAgeGreaterThan(30);
        greaterThan.forEach(user -> {
            System.out.println(user);
        });*/

      /*  List<User> userByCountryIn = userRepository.findUserByCountryIn(Arrays.asList("America", "Australia"));
        userByCountryIn.forEach(user -> {
            System.out.println(user);
        });*/

        //live in aus age>30

      /*  List<User> australia = userRepository.findUserByCountryAndAgeGreaterThan("Australia", 30);
        australia.forEach(user -> {
            System.out.println(user);
        });*/

        List<User> userByCountryAndAgeAndGender = userRepository.findUserByCountryAndAgeAndGender("Nepal", 20, "Male");
        userByCountryAndAgeAndGender.forEach(user -> {
            System.out.println(user);
        });

    }

}
