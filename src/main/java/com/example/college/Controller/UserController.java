package com.example.college.Controller;

import com.example.college.Dto.BaseResponse;
import com.example.college.Dto.UserDetails;
import com.example.college.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController<userDetails> {

    @Autowired
    private UserService userService;

    @PostMapping("post-user-Details")
    public ResponseEntity<BaseResponse> getUserDetails(@RequestBody UserDetails userDetails) {
        if (userDetails == null || userDetails.getAccountDetailsRequests().isEmpty()){

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setMessage("user and account ");
        baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
        baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

        return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
    }
    return userService.getUserDetails(userDetails);

    }



}
