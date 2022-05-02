package com.example.college.ServiceImpl;


import com.example.college.Dto.BaseResponse;
import com.example.college.Dto.UserDetails;
import com.example.college.Services.TestService;
import com.example.college.entity.Student;
import com.example.college.entity.User;
import com.example.college.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TestServiceImpl<user> implements TestService {


    @Autowired
    private UserDAO userDAO;

    @Override
    public ResponseEntity<BaseResponse> findStudentDetails(int userId) {

        BaseResponse baseResponse = new BaseResponse();
        UserDetails userDetails = new UserDetails();
        Optional<User> user = userDAO.findById(userId);


        if (!user.isPresent()) {

            baseResponse.setMessage("User ID  not found");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            baseResponse.setResponse(userDetails);
            baseResponse.setResponse(null);
            return new ResponseEntity<>(baseResponse, HttpStatus.NOT_FOUND);
        }
        User user1 =  user.get();

        userDetails.setId(user1.getId());
        userDetails.setName(user1.getName());
        userDetails.setRoll(user1.getRoll());
        userDetails.setPhone(user1.getPhone());
        userDetails.setAddress(user1.getAddress());

        baseResponse.setMessage("fetch data successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setResponse(HttpStatus.OK.value());
        baseResponse.setResponse(userDetails);

        return new ResponseEntity<>(baseResponse,HttpStatus.OK);
    }

}
