package com.example.college.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOneConroller {

    //path variables
        @GetMapping("fetch-product-details/{productName}{productPrice}")
        public String myFirstMethod(@PathVariable String productName){
            switch (productName) {
                case "bag":
                    return bag();
                case "watch":
                    return watch();
                default:
                    return "no product found";
            }
        }



        public String Sumsang() {
            return "Sumsang is best always ";
        }

        public String apple() {
            return "apple is best camera and many features";
        }
        public String bag() {
            return "Bag is best in the market ";
        }

        public String watch() {
            return "fastrack watch is best";
        }

    }




