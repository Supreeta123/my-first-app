package com.example.college.Controller;


import com.example.college.Dto.BaseResponse;
import com.example.college.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("get-user-details/{userId}")
    public ResponseEntity<BaseResponse> getUserDetails(@PathVariable int userId){
        if (userId == 0 || String.valueOf(userId)==null) {

            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("User ID is 0 or null");
            baseResponse.setHttpStatusCode(HttpStatus.BAD_GATEWAY.value());
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);

            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.BAD_REQUEST);
        }

        return testService.findStudentDetails(userId);
        }
    }




