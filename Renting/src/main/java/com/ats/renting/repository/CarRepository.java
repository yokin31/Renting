/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ats.renting.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ats.renting.model.entity.CarEntity;


/**
 *
 * @author JOAQUI-PTL
 */
public interface CarRepository extends JpaRepository<CarEntity, Integer> {
	
	List<CarEntity> findByBrand(String name);
}
