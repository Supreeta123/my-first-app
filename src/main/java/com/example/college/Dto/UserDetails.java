package com.example.college.Dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class UserDetails {

    private  int id;
    private String firstName;
    private String lastName;
    private String  mobileNumber;
    private String email;


    private List<AccountDetailsRequest> accountDetailsRequests;
}