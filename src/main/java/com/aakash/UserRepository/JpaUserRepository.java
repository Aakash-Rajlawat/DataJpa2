package com.aakash.UserRepository;

import com.aakash.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaUserRepository extends JpaRepository<User,Integer> {
}
