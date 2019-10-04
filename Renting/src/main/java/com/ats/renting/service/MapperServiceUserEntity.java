package com.ats.renting.service;

import org.springframework.stereotype.Service;

import com.ats.renting.model.dto.IMapeadorUserEntity;
import com.ats.renting.model.dto.UserDto;
import com.ats.renting.model.entity.UserEntity;



@Service
public class MapperServiceUserEntity implements IMapeadorUserEntity<UserDto, UserEntity>{
 
	 

	public UserEntity MapperServiceUserEntity(UserDto dto) {
		return new UserEntity(dto.getId(), dto.getName(),dto.getCar());
		}

}
