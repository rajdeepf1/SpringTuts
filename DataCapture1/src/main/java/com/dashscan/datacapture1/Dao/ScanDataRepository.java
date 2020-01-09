package com.dashscan.datacapture1.Dao;

import com.dashscan.datacapture1.Models.ScanDataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScanDataRepository extends JpaRepository<ScanDataModel,Integer> {
    List<ScanDataModel> findAllByScanData(String scanData);
}
