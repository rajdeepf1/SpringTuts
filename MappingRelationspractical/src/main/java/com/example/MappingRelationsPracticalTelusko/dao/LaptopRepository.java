package com.example.MappingRelationsPracticalTelusko.dao;

import com.example.MappingRelationsPracticalTelusko.models.LaptopModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<LaptopModel,Integer> {
}
