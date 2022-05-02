package com.example.college.Services;

import com.example.college.Dto.StudentDetails;

public interface StudentService {


    String fetchStudentDetails(String studentName);

    String fetchStudentDetails(StudentDetails studentDetails);
//
//    static String putStudentDetails(String StudentName) {
//        return null;
//    }


}
