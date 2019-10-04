package com.ats.renting.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ats.renting.model.entity.CarEntity;
import com.ats.renting.repository.CarRepository;


@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;
	
	@Override
	@Transactional(readOnly = true)
	public Optional<CarEntity> findById(Integer id) {
		final Optional<CarEntity> carEntity = carRepository.findById(id);
		return carEntity;
	}

	@Override
	@Transactional
	public CarEntity save(CarEntity carEntity) {
		return carRepository.save(carEntity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<CarEntity> findByBrand(String nombre) {
		List<CarEntity> car = carRepository.findByBrand(nombre);
		return car;
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		carRepository.deleteById(id);

	}

	@Override
	@Transactional(readOnly = true)
	public Page<CarEntity> findAll(Pageable pageable) {
		Page<CarEntity> car = carRepository.findAll(pageable);
		return car;
	}

	

}
