package com.ats.renting.service;

import org.springframework.stereotype.Service;

import com.ats.renting.model.dto.IMapeadorRentDto;
import com.ats.renting.model.dto.RentDto;
import com.ats.renting.model.entity.RentEntity;




@Service
public class MapperServiceRentDto implements IMapeadorRentDto<RentEntity, RentDto>{
 
	 
	@Override
	public RentDto MapperServiceRentDto(RentEntity rent) {
		return new RentDto(rent.getId(), rent.getUser(), rent.getCar(), rent.getIntiD(),rent.getFinalD(),rent.getPrice());

	}

}
