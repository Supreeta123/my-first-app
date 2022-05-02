package com.example.college.Services;


import com.example.college.Dto.BaseResponse;
import org.springframework.http.ResponseEntity;

public interface TestService {


    ResponseEntity<BaseResponse> findStudentDetails(int userID);
}
