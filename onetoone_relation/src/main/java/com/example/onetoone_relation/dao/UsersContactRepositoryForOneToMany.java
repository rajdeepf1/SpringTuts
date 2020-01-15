package com.example.onetoone_relation.dao;

import com.example.onetoone_relation.models.UsersContactModelForOneToMany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepositoryForOneToMany extends JpaRepository<UsersContactModelForOneToMany,Integer> {
}
