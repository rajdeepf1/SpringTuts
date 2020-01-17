package com.example.pagination.Controller;

import com.example.pagination.Dao.ScanDataRepository;
import com.example.pagination.Models.ScanDataListResponseModel;
import com.example.pagination.Models.ScanDataModel;
import com.example.pagination.Models.ScanDataResponseModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RequestMapping("/rest/dash")
@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    ScanDataRepository repository;


    //we can also write this way
    /*@RequestMapping(value = "/insertScanData", method = RequestMethod.POST)*/
    /*@ResponseBody*/
    //we can also write this way
    @PostMapping("/insertScanData")
    public ResponseEntity<ScanDataResponseModel> insertUser (@RequestBody ScanDataModel model) {
        //logger.debug("I am in the controller and got user name: " + user.toString());
        System.out.println(model.getScanData() + "\n" + model.getScanDataTimeStamp());

//        ResponseEntity<List<ScanDataModel>> checkScanData = (List<ScanDataModel>) getAllScannedDataByScanData(model.getScanData());

        List<ScanDataModel> checkScanData = repository.findAllByScanData(model.getScanData());

        if (checkScanData.size() > 0) {
            ScanDataResponseModel scanDataResponseModel = new ScanDataResponseModel();
            scanDataResponseModel.setStatus(false);
            scanDataResponseModel.setMessage("Duplicate Scan Data !");
            return ResponseEntity.ok(scanDataResponseModel);
        } else {

            ScanDataModel scanDataModel = repository.save(model);

            try {
                if (scanDataModel == null && scanDataModel.getId() != 0) {
                    return ResponseEntity.notFound().build();
                } else {
                    ScanDataResponseModel scanDataResponseModel = new ScanDataResponseModel();
                    scanDataResponseModel.setStatus(true);
                    scanDataResponseModel.setMessage("ok");
                    scanDataResponseModel.setResponse(scanDataModel);
                    return ResponseEntity.ok(scanDataResponseModel);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return ResponseEntity.notFound().build();
            }
        }


    }

    @GetMapping("/getAllScannedData")
    public ScanDataListResponseModel getAllScannedData(){

        List<ScanDataModel> list = repository.findAll();

        if (list == null && list.size() < 0){

            ScanDataListResponseModel model = new ScanDataListResponseModel();

            model.setStatus(false);
            model.setMessage("No Data Found!");
            model.setList(null);

            return model;
        }else {

            ScanDataListResponseModel model = new ScanDataListResponseModel();

            model.setStatus(true);
            model.setMessage("Data Found!"+" count is : "+list.size());
            model.setList(list);

            return model;
        }
    }

    @GetMapping("/getAllScannedDataByScanData")
    public ResponseEntity<List<ScanDataModel>> getAllScannedDataByScanData(@RequestParam String scanData){
        return ResponseEntity.ok(repository.findAllByScanData(scanData));
    }


    @GetMapping("/getAllScannedDataByPagination/{pageNo}")
    public ScanDataListResponseModel getAllScannedDataByPagination(@PathVariable int pageNo){

        Pageable paging = PageRequest.of(pageNo, 10 /*,Sort.by(sortBy)*/, Sort.Direction.ASC,"id");

        List<?> list = Collections.singletonList(repository.findAll(paging));

        ScanDataListResponseModel model = new ScanDataListResponseModel();

        if (list.size() != 0){
            model.setStatus(true);
            model.setMessage("Success");
            model.setList((List<ScanDataModel>) list);
            return model;
        }else {
            model.setStatus(false);
            model.setMessage("No Data Found !");
            model.setList(null);
            return model;
        }

    }

}
