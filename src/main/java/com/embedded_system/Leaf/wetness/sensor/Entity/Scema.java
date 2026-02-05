package com.embedded_system.Leaf.wetness.sensor.Entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Scema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double humidity;
    private  double temperature;
    private double voltage , current , resistence;


    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> wetnessLabel = new HashSet<>();

    public Set<String> getWetnessLabel() {
        return wetnessLabel;
    }

    public void setWetnessLabel(Set<String> wetnessLabel) {
        this.wetnessLabel = wetnessLabel;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getResistence() {
        return resistence;
    }

    public void setResistence(double resistence) {
        this.resistence = resistence;
    }



}
