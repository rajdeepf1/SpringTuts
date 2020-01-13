package com.example.springBootWithMsSqlServer.Dao;

import com.example.springBootWithMsSqlServer.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
