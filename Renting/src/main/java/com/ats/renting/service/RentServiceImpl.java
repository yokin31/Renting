package com.ats.renting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ats.renting.model.entity.CarEntity;
import com.ats.renting.model.entity.RentEntity;
import com.ats.renting.repository.CarRepository;
import com.ats.renting.repository.RentRepository;


@Service
public class RentServiceImpl implements RentService {

	@Autowired
	private RentRepository rentRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<RentEntity> findById(Integer id) {
		final Optional<RentEntity> carEntity = rentRepository.findById(id);
		return carEntity;
	}

	@Override
	@Transactional
	public RentEntity save(RentEntity rentEntity) {
		return rentRepository.save(rentEntity);
	}

	

	@Override
	@Transactional
	public void delete(Integer id) {
		rentRepository.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Page<RentEntity> findAll(Pageable pageable) {
		Page<RentEntity> car = rentRepository.findAll(pageable);
		return car;
	}

	

}
