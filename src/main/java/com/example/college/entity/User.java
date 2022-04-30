package com.example.college.entity;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@EqualsAndHashCode
@Entity

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