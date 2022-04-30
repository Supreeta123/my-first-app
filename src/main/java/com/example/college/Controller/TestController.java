package com.example.college.Controller;

import com.example.college.Services.TestService;
import com.example.college.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @Autowired
    private TestService testService;

//    @GetMapping("get-product-details/{tatoId}")
//    public ProductDetails fetchProductNewDetails(@PathVariable int tatoId){
//        return testService.getProductDetails(tatoId);


//    @GetMapping("get-product-details/{tatoId}")
//    public ReviewResponse fetchReviewResponse(@PathVariable int tatoId){
//        return testService.getReviewResponse(tatoId);
//
//    }

    @GetMapping("get-product-details/{userName}/{userId}")
    public User fetchUserNewDetails(@PathVariable String userName,@PathVariable int userId) {

        return testService.getUserDetails(userName,userId);
    }

}



