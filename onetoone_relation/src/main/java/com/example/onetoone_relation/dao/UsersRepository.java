package com.example.onetoone_relation.dao;

import com.example.onetoone_relation.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}
