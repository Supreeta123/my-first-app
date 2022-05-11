package com.example.college.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Account{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String accountNumber;

    private String balance;
    private  String accountType;
    private String status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;


}
