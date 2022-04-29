


package com.example.college.Controller;


import com.example.college.Dto.StudentDetails;
import com.example.college.Dto.UserDetails;
import com.example.college.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

//    @GetMapping("fetch-productdetails/{productName}")
//    public String myFirstMethod(@PathVariable String productName) {
//        String result = testService.fetchProductDetails(productName);
//        return result;
//
//    }


//    @PostMapping("register-student")
//    public String registerNewStudent(@RequestBody StudentDetails studentDetails) {
//        return testService.registerStudent(studentDetails);


    @GetMapping("get-user-details/{userId}")
    public UserDetails fetchUserDetails(@PathVariable int userId) {

        return testService.getUserDetails(userId);
    }


}





