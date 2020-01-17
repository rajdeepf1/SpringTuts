package com.example.pagination.Dao;

import com.example.pagination.Models.ScanDataModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface ScanDataRepository extends JpaRepository<ScanDataModel,Integer> {
    List<ScanDataModel> findAllByScanData(String scanData);
    //List<ScanDataModel> findAllByScanDataPaging(Pageable pageable);

}
