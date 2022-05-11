package com.example.college.repository;

import com.example.college.entity.Users;
import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDAO extends JpaRepository<Users, Integer> {


}