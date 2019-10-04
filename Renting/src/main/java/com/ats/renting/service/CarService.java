package com.ats.renting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ats.renting.model.entity.CarEntity;

public interface CarService {
	 public Optional<CarEntity> findById(Integer id) ;
	 public CarEntity save(CarEntity carEntity) ;
	 public List<CarEntity> findByBrand(String nombre);
	 public void delete(Integer id);
	 public Page<CarEntity> findAll(Pageable pageable);
}
