package com.example.college.ServiceImpl;


import com.example.college.Services.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {


    @Override
    public String fetchProductDetails(String productName) {
        if(productName != null) {
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
    }


