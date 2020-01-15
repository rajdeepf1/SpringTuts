package com.example.onetoone_relation.dao;

import com.example.onetoone_relation.models.UsersModelForOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepositoryForOnetoMany extends JpaRepository<UsersModelForOneToMany,Integer> {
    List<UsersModelForOneToMany> findByName(String name);
}
