package com.example.college.ServiceImpl;


import com.example.college.Dto.StudentDetails;
import com.example.college.Services.TestService;
import com.example.college.entity.User;
import com.example.college.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

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

    @Override
    public String registerStudent(StudentDetails studentDetails) {

        User user = new User();
        user.setName(studentDetails.getName());
        user.setAge(studentDetails.getAge());
        userDAO.save(user);
        return "User saved successfully";
    }


    }



