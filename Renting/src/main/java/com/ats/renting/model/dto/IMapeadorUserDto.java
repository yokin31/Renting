package com.ats.renting.model.dto;

public interface IMapeadorUserDto<I,O> {
	/**
	 * 
	 * @param object
	 * @return
	 * pasamos datos de UserEntity a UserDto
	 */
	public O MapperServiceUserDto(I object);
}
