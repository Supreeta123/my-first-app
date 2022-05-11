package com.example.college.ServiceImpl;


import com.example.college.Dto.AccountDetailsRequest;
import com.example.college.Dto.BaseResponse;
import com.example.college.Dto.UserDetails;
import com.example.college.Services.UserService;
import com.example.college.entity.Account;
import com.example.college.entity.Users;
import com.example.college.repository.AccountDetailsDAO;
import com.example.college.repository.UserDAO;
import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.UserDatabase;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private AccountDetailsDAO accountDetailsDAO;


    @Override
    public ResponseEntity<BaseResponse> getUserDetails(UserDetails userDetails) {

        BaseResponse baseResponse = new BaseResponse();
        Users users = new Users();

        users.setId(userDetails.getId());
        users.setFirstName(userDetails.getFirstName());
        users.setLastName(userDetails.getLastName());
        users.setMobileNumber(userDetails.getMobileNumber());
        users.setEmail(userDetails.getEmail());


        userDAO.save(users);

        List<AccountDetailsRequest> accountDetailsRequestList= userDetails.getAccountDetailsRequests();

        for (AccountDetailsRequest accountDetailsRequest : accountDetailsRequestList) {
            Account account1 = new Account();

            account1.setId(accountDetailsRequest.getId());
            account1.setAccountNumber(accountDetailsRequest.getAccountNubmer());
            account1.setBalance(accountDetailsRequest.getAccountType());
            account1.setStatus(accountDetailsRequest.getStatus());
            account1.setUsers(users);
            accountDetailsDAO.save(account1);
        }

        baseResponse.setMessage("Details saved successfully");
        baseResponse.setHttpStatusCode(HttpStatus.CREATED.value());
baseResponse.setHttpStatus(HttpStatus.CREATED);

return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.CREATED);
    }

}
