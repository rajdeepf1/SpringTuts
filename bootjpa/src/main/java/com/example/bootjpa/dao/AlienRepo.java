package com.example.bootjpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.bootjpa.model.AlienModel;

public interface AlienRepo extends CrudRepository<AlienModel, Integer>{

}
