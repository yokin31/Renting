package com.ats.renting.model.dto;

public interface IMapeadorRentDto<I,O>  {
	/**
	 * 
	 * @param object
	 * @return
	 * pasamos datos de RentkEntity a RentDto
	 */
	public O MapperServiceRentDto(I object);
}
