package com.example.college.ServiceImpl;

import com.example.college.Dto.StudentDetails;
import com.example.college.Services.StudentService;
import com.example.college.entity.Student;
import com.example.college.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl<student> implements StudentService {

    @Autowired
    private StudentDAO studentDAO;


    @Override
    public String fetchStudentDetails(String studentName) {
        return null;
    }

    @Override
    public String fetchStudentDetails(StudentDetails studentDetails) {
        Student student = new Student();
        student.setId(studentDetails.getId());
        student.setName(studentDetails.getName());
        student.setRoll(studentDetails.getRoll());
        student.setPhone(studentDetails.getPhone());
        student.setAddress(studentDetails.getAddress());

        studentDAO.save(student);
        return "User saved successfully";
    }
    }


