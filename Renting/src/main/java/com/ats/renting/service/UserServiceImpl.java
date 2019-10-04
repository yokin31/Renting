package com.ats.renting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ats.renting.model.entity.UserEntity;
import com.ats.renting.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<UserEntity> findById(Integer id) {
		final Optional<UserEntity> userEntity = userRepository.findById(id);
		return userEntity;
	}

	@Override
	@Transactional
	public UserEntity save(UserEntity userEntity) {
		return userRepository.save(userEntity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<UserEntity> findByName(String nombre) {
		List<UserEntity> user = userRepository.findByName(nombre);
		return user;
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		userRepository.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Page<UserEntity> findAll(Pageable pageable) {
		Page<UserEntity> user = userRepository.findAll(pageable);
		return user;
	}

}
