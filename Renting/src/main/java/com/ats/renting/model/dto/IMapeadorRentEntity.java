package com.ats.renting.model.dto;

public interface IMapeadorRentEntity<I,O>  {
	/**
	 * 
	 * @param object
	 * @return
	 * pasamos datos de RentkDto a RentEntity
	 */
	public O MapperServiceRentEntity(I object);
}
