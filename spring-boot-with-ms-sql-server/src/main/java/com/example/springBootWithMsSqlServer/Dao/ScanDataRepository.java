package com.example.springBootWithMsSqlServer.Dao;
import com.example.springBootWithMsSqlServer.Models.ScanDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScanDataRepository extends JpaRepository<ScanDataModel,Integer> {
    List<ScanDataModel> findAllByScanData(String scanData);
}
