package com.smart.demoallcrudmapping.repository;

import com.smart.demoallcrudmapping.model.CarDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDetailRepository extends JpaRepository<CarDetail, Long> {
}
