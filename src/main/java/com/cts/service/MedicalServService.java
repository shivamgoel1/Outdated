package com.cts.service;

import java.util.List;

import com.cts.entity.Services;

public interface MedicalServService {
	
	List<Services> listAllServices();
	void  saveMedicalService(Services medicalservice);
	public Services getService(int id);
	void delete(int theId);

}
