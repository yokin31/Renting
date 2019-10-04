package com.ats.renting.model.dto;

public interface IMapeadorUserEntity<I,O>  {
	/**
	 * 
	 * @param object
	 * @return
	 * pasamos datos de UserkDto a UserEntity
	 */
	public O MapperServiceUserEntity(I object);
}
