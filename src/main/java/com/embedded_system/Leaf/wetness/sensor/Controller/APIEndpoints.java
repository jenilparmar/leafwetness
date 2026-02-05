package com.embedded_system.Leaf.wetness.sensor.Controller;


import com.embedded_system.Leaf.wetness.sensor.Entity.Scema;
import com.embedded_system.Leaf.wetness.sensor.Service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dataStore")
public class APIEndpoints {
    private final SensorService service;
    public  APIEndpoints(SensorService service){
        this.service = service;
    }

    @GetMapping
    public List<Scema> user() {
        List<Scema> dataFromDB = service.getDataFromDB();
        return dataFromDB;
    }


    @PostMapping
    public Scema sendData(@RequestBody Scema data){
        return service.saveDataToDb(data);
    }



}
