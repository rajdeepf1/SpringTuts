package com.example.MappingRelationsPracticalTelusko.dao;

import com.example.MappingRelationsPracticalTelusko.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel,Integer> {
}
