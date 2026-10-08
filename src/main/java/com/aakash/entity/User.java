package com.aakash.entity;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
@Entity
@Table(name = "userDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private Integer userId;

    @Column(name = "user_Name")
    private String userName;

    @Column(name = "user_Gender")
    private String gender;

    @Column(name = "user_Age")
    private Integer age;

    @Column(name = "user_Country")
    private String country;

    @CreationTimestamp
    @Column(name = "createdDateAndTime" , updatable = false )
    private LocalDateTime createdDate;

    @UpdateTimestamp
    @Column(name = "updatedDateAndTime" , insertable = false)
    private LocalDateTime updatedDateAndTime;


}
