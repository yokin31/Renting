package com.ats.renting.controller;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ats.renting.exception.NotFoundException;
import com.ats.renting.model.dto.UserDto;
import com.ats.renting.model.entity.UserEntity;
import com.ats.renting.service.UserService;



@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private MapperServiceUserDto mapeoService;
	
	@Autowired
	private MapperServiceUserEntity mapeoServiceEntity;
	


	

	@GetMapping("/{id}")
	public UserDto findOne(@PathVariable("id") Integer id) throws NotFoundException {
		if(id < 0) {
			throw new NotFoundException("ERROR 404 ,El id no existe");
		}else {
			UserEntity ue = userService.findById(id);
			UserDto udo =  mapeoService.MapperServiceUserDto(ue);
;
			return udo;
		}		
	}

	@PostMapping
	public UserDto create(@RequestBody @Valid UserDto userDto)  {	
				
		UserEntity ue = mapeoServiceEntity.MapperServiceUserEntity(userDto);
	    userService.save(ue);   
		UserDto udo =  mapeoService.MapperServiceUserDto(ue);
		return udo;
	}

	@PutMapping("/{id}")
	public UserDto update(@PathVariable("id") Integer id, @RequestBody UserDto userDto) {
		return userDto;
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer id) {
     userService.delete(id);
	}
    
	
	@GetMapping
	public Page<UserEntity> findAll(
		@RequestParam(name= "page", required = false, defaultValue = "0") Integer page,
		@RequestParam(name= "size", required = false, defaultValue = "15") Integer size,
		@RequestParam(name= "name", required = false) String name){
		
		final Pageable pageable = PageRequest.of(page, size);
		Page<UserEntity> ue = userService.findAll(pageable);
		return ue;
	}
}
	
