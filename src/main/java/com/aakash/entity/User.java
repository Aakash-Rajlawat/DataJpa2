package com.aakash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "userDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
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



}
