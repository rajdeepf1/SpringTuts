package com.example.springBootWithMsSqlServer.Dao;

import com.example.springBootWithMsSqlServer.Models.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test,Integer> {
}
