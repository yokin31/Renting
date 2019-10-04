package com.ats.renting.service;

import org.springframework.stereotype.Service;

import com.ats.renting.model.dto.CarDto;
import com.ats.renting.model.dto.IMapeadorCarEntity;
import com.ats.renting.model.entity.CarEntity;


@Service
public class MapperServiceCarEntity implements IMapeadorCarEntity<CarDto, CarEntity>{
 
	public CarEntity MapperServiceCarEntity(CarDto dto) {
		return new CarEntity(dto.getId(), dto.getModel(),dto.getBrand());
		}

}
