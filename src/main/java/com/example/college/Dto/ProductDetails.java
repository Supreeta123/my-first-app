package com.example.college.Dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class ProductDetails {

    private int id;
    private String name;
    private String type;
    private String price;
    private String details;



    private List<ReviewResponse> reviewResponses;

    public void setReviewResponse(List<ReviewResponse> reviewResponsesList) {
    }


//    private ReviewResponse reviewResponse;
}
