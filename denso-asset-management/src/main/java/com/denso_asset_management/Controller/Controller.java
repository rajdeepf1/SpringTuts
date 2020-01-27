package com.denso_asset_management.Controller;

import com.denso_asset_management.Dao.TableAssetDetailRepository;
import com.denso_asset_management.Models.TableAssetDetailModel;
import com.denso_asset_management.Models.TableAssetDetailModelTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/rest/densoAssetManagement")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    TableAssetDetailRepository repository;

    @GetMapping("/getData")
    public List<TableAssetDetailModel>getData(){
        return repository.findAll();
    }





}
//https://www.javaguides.net/2019/01/spring-boot-microsoft-sql-server-jpa-hibernate-crud-restful-api-tutorial.html