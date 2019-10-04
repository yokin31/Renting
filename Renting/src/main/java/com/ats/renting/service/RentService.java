package com.ats.renting.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ats.renting.model.entity.RentEntity;


public interface RentService {
	
	 public Optional<RentEntity> findById(Integer id) ;
	 public RentEntity save(RentEntity rentEntity) ;
	 public void delete(Integer id);
	 public Page<RentEntity> findAll(Pageable pageable);

}
