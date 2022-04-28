

package com.example.college.Controller;


import com.example.college.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("fetch-productdetails/{productName}")
    public String myFirstMethod(@PathVariable String productName) {
        String result=testService.fetchProductDetails(productName);
        return result;
    }
}




