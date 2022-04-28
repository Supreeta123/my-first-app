package com.example.college.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Setter
@Getter
@ToString
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType .AUTO)
    @Column(name= "id")
    private  int id;

    @Column(name= "name")
    private  String name;

    @Column(name= "age")
    private String age;

}