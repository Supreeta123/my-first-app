package com.example.college.repository;


import com.example.college.entity.Tato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDAO extends JpaRepository<Tato, Integer>{



}