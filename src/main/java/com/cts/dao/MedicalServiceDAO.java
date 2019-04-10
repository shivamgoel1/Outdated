package com.cts.dao;

import java.util.List;

import com.cts.entity.Services;


public interface MedicalServiceDAO {
	
	List<Services> listAllServices();
	void  saveMedicalService(Services medicalservice);
	public Services getService(int id);
	void delete(int theId);

}
