package com.embedded_system.Leaf.wetness.sensor.Repository;

import com.embedded_system.Leaf.wetness.sensor.Entity.Scema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Scema , Long> {

}
