package com.example.college.Services;

import com.example.college.Dto.BaseResponse;
import com.example.college.Dto.UserDetails;
import org.springframework.http.ResponseEntity;

public interface UserService {


    ResponseEntity<BaseResponse> getUserDetails(UserDetails userDetails);
}
