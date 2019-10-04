package com.ats.renting.model.dto;

public interface IMapeadorCarDto<I,O>  {
	/**
	 * 
	 * @param object
	 * @return
	 * pasamos datos de CarkEntity a CarDto
	 */
	public O MapperServiceCarDto(I object);
}
