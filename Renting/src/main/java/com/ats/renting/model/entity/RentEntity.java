package com.ats.renting.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rents")
public class RentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private UserEntity user;
	private CarEntity car;
	private Date intiD;
	private Date finalD;
	private Double price;
	
	public RentEntity() {
	}

	public RentEntity(Integer id, UserEntity user, CarEntity car, Date intiD, Date finalD, Double price) {
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

	@Override
	public String toString() {
		return "Rent [id=" + id + ", user=" + user + ", car=" + car + ", intiD=" + intiD + ", finalD=" + finalD
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((finalD == null) ? 0 : finalD.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((intiD == null) ? 0 : intiD.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RentEntity other = (RentEntity) obj;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (finalD == null) {
			if (other.finalD != null)
				return false;
		} else if (!finalD.equals(other.finalD))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (intiD == null) {
			if (other.intiD != null)
				return false;
		} else if (!intiD.equals(other.intiD))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	

}
