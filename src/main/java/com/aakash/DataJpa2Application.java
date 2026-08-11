package com.aakash;

import com.aakash.UserRepository.JpaUserRepository;
import com.aakash.UserRepository.UserRepository;
import com.aakash.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DataJpa2Application {

    public static void main(String[] args) {

        //interface object is made by the spring
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DataJpa2Application.class, args);
        JpaUserRepository jpaUserRepository = configurableApplicationContext.getBean(JpaUserRepository.class);



        User u1 = new User(1,"Aakash","Male",20,"Nepal");
        User u2 = new User(2,"Sam","Male",40,"America");
        User u3 = new User(3,"Tom","Male",65,"Australia");
        User u4 = new User(4,"Jerry","Male",35,"Australia");
        User u5 = new User(5,"Thomas","Male",45,"America");
        User u6 = new User(6,"Marcus","Male",95,"America");
        User u7 = new User(7,"Devi","Fe-Male",29,"India");
        User u8 = new User(8,"Red","Male",51,"America");


      /*  List<User> users = jpaUserRepository.saveAll(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));
        for (User user : users){
            System.out.println(user);
        }*/

        /*int pageSize =2, pageNumber =1;
        Page<User> userDetail = jpaUserRepository.findAll(Pageable.ofSize(pageSize).withPage(pageNumber-1));
        for(User user : userDetail){
            System.out.println(user);
        }*/

        /*List<User> users = jpaUserRepository.findAll(Sort.by("userId","country"));
        for(User user : users){
            System.out.println(user);
        }*/

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

        /*List<User> userByCountryAndAgeAndGender = userRepository.findUserByCountryAndAgeAndGender("Nepal", 20, "Male");
        userByCountryAndAgeAndGender.forEach(user -> {
            System.out.println(user);
        });*/


        /*List<User> users = userRepository.getAllUserHql();
        for (User user : users){
            System.out.println(user);
        }*/

        /*List<User> users = userRepository.getAllUserSql();
        for(User user : users){
            System.out.println(user);
        }*/


        /*List<User> whateverNameIWant = userRepository.getAlLUsersByCountry("Australia");
        for ( User user:whateverNameIWant){
            System.out.println(user);
        }*/
    }

}
