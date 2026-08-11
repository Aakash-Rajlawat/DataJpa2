package com.aakash.UserRepository;

import com.aakash.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends CrudRepository<User,Integer> {
    List<User> findByCountry(String country);
    List<User> findUserByAge(Integer age);
    List<User> findUserByAgeGreaterThan(Integer ageIsGreaterThan);
    List<User> findUserByCountryIn(List<String> countries);
    List<User> findUserByCountryAndAgeGreaterThan(String country, Integer ageIsGreaterThan);
    List<User> findUserByCountryAndAgeAndGender(String country, Integer age, String gender);

    @Query(value = "From User")
    List<User> getAllUserHql();

    @Query(value = "select * from user_details",nativeQuery = true)
    List<User> getAllUserSql();

    @Query(value="from User where country=:cname")
    List<User> getAlLUsersByCountry(String cname);
}
