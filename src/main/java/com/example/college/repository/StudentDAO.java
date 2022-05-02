package com.example.college.repository;




import com.example.college.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentDAO extends JpaRepository<Student, Integer>{



}
