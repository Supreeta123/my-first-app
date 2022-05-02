package com.example.college.repository;


import com.example.college.entity.Student;
import com.example.college.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<User, Integer>{



}


