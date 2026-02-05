package com.embedded_system.Leaf.wetness.sensor.Service;

import com.embedded_system.Leaf.wetness.sensor.Entity.Scema;
import com.embedded_system.Leaf.wetness.sensor.Repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {
    private final SensorRepository repo;
    public SensorService(SensorRepository repo){
        this.repo = repo;
    }

    public Scema saveDataToDb(Scema data){
        return  repo.save(data);
    }

    public List<Scema> getDataFromDB(){
        return repo.findAll();
    }
}
