package com.example.bootjpa_mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa_mysql.models.User;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
