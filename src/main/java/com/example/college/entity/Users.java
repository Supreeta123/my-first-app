package com.example.college.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
//@Table(name="user")
public class  Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private  String mobileNumber;
    private String email;


    @OneToMany(mappedBy = "users")
    private List<Account> accounts;





}
