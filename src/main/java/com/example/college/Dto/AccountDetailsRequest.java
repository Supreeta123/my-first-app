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

public class AccountDetailsRequest {
    private int id;
    private String accountNubmer;
    private String balance;
    private String  accountType;
    private String status;


}