package com.denso_asset_management.Controller;

import com.denso_asset_management.Dao.TBLSCANMASTER_Repository;
import com.denso_asset_management.Dao.TableAssetDetailRepository;
import com.denso_asset_management.Models.TBLSCANMASTERModel;
import com.denso_asset_management.Models.TableAssetDetailModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/rest/densoAssetManagement")
@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    TableAssetDetailRepository tableAssetDetailRepository;

    @Autowired
    TBLSCANMASTER_Repository tblscanmasterRepository;


    @GetMapping("/getData")
    public List<TableAssetDetailModel>getData(){
        return tableAssetDetailRepository.findAll();
    }


    @PostMapping("/insertData")
    public TBLSCANMASTERModel insertdata(@RequestBody TBLSCANMASTERModel data){

        System.out.println("We Get Values__"+data.toString());

        return data;
    }


    @GetMapping("/getDataFromScanMaster")
    public List<TBLSCANMASTERModel>getDataFromScanMaster(){
        return tblscanmasterRepository.findAll();
    }



}
//https://www.javaguides.net/2019/01/spring-boot-microsoft-sql-server-jpa-hibernate-crud-restful-api-tutorial.html