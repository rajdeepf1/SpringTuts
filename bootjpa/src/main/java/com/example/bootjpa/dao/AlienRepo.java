package com.example.bootjpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.model.AlienModel;


public interface AlienRepo extends CrudRepository<AlienModel, Integer>{

	List<AlienModel> findByTech(String tech);
	
	List<AlienModel> findByAidGreaterThan(int aid);
	
}
