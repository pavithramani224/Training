package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Insurance;

public interface InsuranceRepository<T  extends Insurance> extends JpaRepository<T, Integer> {

//	@Query(nativeQuery=true,value="select * from jasna_health_insurance")
//
//	public List<Insurance> findHealthProducts();
}
