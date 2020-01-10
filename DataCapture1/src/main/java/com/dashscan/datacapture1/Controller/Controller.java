package com.dashscan.datacapture1.Controller;

import com.dashscan.datacapture1.Dao.ScanDataRepository;
import com.dashscan.datacapture1.Models.ScanDataListResponseModel;
import com.dashscan.datacapture1.Models.ScanDataModel;
import com.dashscan.datacapture1.Models.ScanDataResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/rest/dash")
@RestController
public class Controller {

    //private static final Logger logger = LoggerFactory.getLogger(JSonController.class);

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

}
