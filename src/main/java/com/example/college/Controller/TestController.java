package com.example.college.Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {


    @GetMapping("test")
    public String myFirstMethod() {
        return "Hey guys!!!  Its me, SpringBoot endpoint response";
    }
}
