package com.example.bootjpa_mysql.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.bootjpa_mysql.models.User;




// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

// but we are now using JpaRepository because it contains all methods of crud.

public interface UserRepository extends JpaRepository<User, Integer> { 
	
	@Query(value = "SELECT * FROM user WHERE name = ?1",nativeQuery = true)
	List<User> findAllUserByQuery(String name);
	
	@Modifying
	@Transactional
	@Query(value = "UPDATE user  set email = ?1 WHERE name = ?2",nativeQuery = true)
	int updateEmailByName(String email,String name);
	
	
}

