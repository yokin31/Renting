package com.ats.renting.model.dto;

import java.util.Date;



import com.ats.renting.model.entity.CarEntity;
import com.ats.renting.model.entity.UserEntity;

public class RentDto {
	
	private Integer id;
	private UserEntity user;
	private CarEntity car;
	private Date intiD;
	private Date finalD;
	private Double price;

	public RentDto() {
	}
	
	public RentDto(Integer id, UserEntity user, CarEntity car, Date intiD, Date finalD, Double price) {
		super();
		this.id = id;
		this.user = user;
		this.car = car;
		this.intiD = intiD;
		this.finalD = finalD;
		this.price = price;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public CarEntity getCar() {
		return car;
	}
	public void setCar(CarEntity car) {
		this.car = car;
	}
	public Date getIntiD() {
		return intiD;
	}
	public void setIntiD(Date intiD) {
		this.intiD = intiD;
	}
	public Date getFinalD() {
		return finalD;
	}
	public void setFinalD(Date finalD) {
		this.finalD = finalD;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
