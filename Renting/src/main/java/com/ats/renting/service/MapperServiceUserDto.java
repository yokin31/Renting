package com.ats.renting.service;

import org.springframework.stereotype.Service;

import com.ats.renting.model.dto.IMapeadorUserDto;
import com.ats.renting.model.dto.UserDto;
import com.ats.renting.model.entity.UserEntity;


@Service
public class MapperServiceUserDto implements IMapeadorUserDto<UserEntity, UserDto>{
 
	 
	@Override
	public UserDto MapperServiceUserDto(UserEntity user) {
		return new UserDto(user.getId(), user.getName(), user.getCar());

	}

}
