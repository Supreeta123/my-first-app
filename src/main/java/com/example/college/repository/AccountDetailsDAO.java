package com.example.college.repository;

import com.example.college.entity.Account;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface AccountDetailsDAO extends JpaRepository<Account, Integer> {


}