package com.example.onetoone_relation.dao;

import com.example.onetoone_relation.models.UsersContact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersContactRepository extends JpaRepository<UsersContact,Integer> {
}
