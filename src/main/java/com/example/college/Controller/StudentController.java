package com.example.college.Controller;


import com.example.college.Dto.StudentDetails;
import com.example.college.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("post-student-Details")
    public String myFirstMethod(@RequestBody StudentDetails studentDetails) {
        return studentService.fetchStudentDetails(studentDetails);

    }

    @PutMapping("fetch-studentDetails/{studentName}")
    public String myFirstMethod(@RequestBody String studentName) {

        String result = StudentService.putStudentDetails(studentName);
        return result;
    }
}

