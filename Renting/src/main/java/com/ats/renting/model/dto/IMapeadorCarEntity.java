package com.ats.renting.model.dto;

public interface IMapeadorCarEntity<I,O>  {
	/**
	 * 
	 * @param object
	 * @return
	 * pasamos datos de CarkDto a CarEntity
	 */
	public O MapperServiceCarEntity(I object);
}
