package com.example.college.Dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;


@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDetails {

    private int id;
    private String name;
    private String roll;
    private String phone;
    private String address;



}
