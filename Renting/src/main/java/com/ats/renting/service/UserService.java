package com.ats.renting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ats.renting.model.entity.UserEntity;


public interface UserService {
    
	 public Optional<UserEntity> findById(Integer id) ;
	 public UserEntity save(UserEntity userEntity) ;
	 public List<UserEntity> findByName(String nombre);
	 public void delete(Integer id);
	 public Page<UserEntity> findAll(Pageable pageable);
	
}
