package com.denso_asset_management.Dao;
import com.denso_asset_management.Models.TableAssetDetailModel;
import com.denso_asset_management.Models.TableAssetDetailModelTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TableAssetDetailRepository extends JpaRepository<TableAssetDetailModel,Long> {
//    List<TableAssetDetailModel> findAllByScanData(String scanData);

    @Query(value = "select * from tblAssetDetail",
            nativeQuery = true)
    List<TableAssetDetailModel> findAllData();

}
