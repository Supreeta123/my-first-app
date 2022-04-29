package com.example.college.ServiceImpl;


import com.example.college.Dto.StudentDetails;
import com.example.college.Dto.UserDetails;
import com.example.college.Services.TestService;
import com.example.college.entity.User;
import com.example.college.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl<user> implements TestService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "Apple":
                    return " Apple is best camera";
                case "Sumsang":
                    return "Sumsang is best camera";
                default:
                    return " No Products Found";

            }
        } else {
            return "productName connot be null";
        }
    }

//    @Override
//    public String registerStudent(StudentDetails studentDetails) {
//
//        return null;
//    }


    @Override
    public String registerStudent(StudentDetails studentDetails) {

        User user = new User();
        user.setName(studentDetails.getName());
        user.setAge(studentDetails.getAge());
        userDAO.save(user);
        return "User saved successfully";
    }
//
//        @Override
//    public UserDetails getUserDetails(int userDetails) {
//        return null;
//    }
//


    @Override
    public UserDetails getUserDetails(int UserId) {

        Optional<User> user = userDAO.findById(UserId);
        User user1 = user.get();
        UserDetails userDetails = new UserDetails();
        userDetails.setName(user1.getName());
        userDetails.setAge(user1.getAge());
//    userDAO.save(userDetails);
        userDetails.setId(userDetails.getId());

        return userDetails;


    }

}




