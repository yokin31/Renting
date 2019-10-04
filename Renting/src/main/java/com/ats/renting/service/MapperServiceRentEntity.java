package com.ats.renting.service;

import org.springframework.stereotype.Service;

import com.ats.renting.model.dto.IMapeadorRentEntity;
import com.ats.renting.model.dto.IMapeadorUserEntity;
import com.ats.renting.model.dto.RentDto;
import com.ats.renting.model.entity.RentEntity;




@Service
public class MapperServiceRentEntity implements IMapeadorRentEntity<RentDto, RentEntity>{
 
	 
	@Override 
	public RentEntity MapperServiceRentEntity(RentDto dto) {
		return new RentEntity(dto.getId(), dto.getUser(), dto.getCar(), dto.getIntiD(),dto.getFinalD(),dto.getPrice());
		}
}
