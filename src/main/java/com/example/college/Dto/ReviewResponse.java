package com.example.college.Dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

    @Getter
    @Setter
    @EqualsAndHashCode
    @ToString
    public class ReviewResponse {


        private String reviewerName;
        private String review;
        private String rating;

    }
