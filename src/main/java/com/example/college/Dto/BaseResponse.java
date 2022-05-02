package com.example.college.Dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Setter
@Getter
@ToString
public class BaseResponse {

    private String message;        // messege required
    private HttpStatus httpStatus; // not found
    private int httpStatusCode;    //ok
    private Object response;


}
