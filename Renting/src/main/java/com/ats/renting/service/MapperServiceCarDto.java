package com.ats.renting.service;

import org.springframework.stereotype.Service;

import com.ats.renting.model.dto.CarDto;
import com.ats.renting.model.dto.IMapeadorCarDto;

import com.ats.renting.model.entity.CarEntity;



@Service
public class MapperServiceCarDto implements IMapeadorCarDto<CarEntity, CarDto>{
 
	 
	@Override
	public CarDto MapperServiceCarDto(CarEntity car) {
		return new CarDto(car.getId(), car.getModel(), car.getBrand(),car.getUser());

	}

}
