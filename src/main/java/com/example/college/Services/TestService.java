package com.example.college.Services;


import com.example.college.Dto.StudentDetails;
import com.example.college.Dto.UserDetails;
import org.springframework.stereotype.Component;

@Component
public interface TestService {

    String fetchProductDetails(String productName);

    String registerStudent(StudentDetails studentDetails);

     UserDetails getUserDetails(int userDetails);


}