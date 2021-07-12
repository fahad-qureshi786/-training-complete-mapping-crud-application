package com.smart.demoallcrudmapping.repository;

import com.smart.demoallcrudmapping.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
