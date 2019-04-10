package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.MedicalServiceDAO;
import com.cts.entity.Services;


@Service("medicalServService")
public class MedicalServServiceImpl implements  MedicalServService{
	
	@Autowired
	MedicalServiceDAO medicalDAO;
	
	@Override
	@Transactional
	public List<Services> listAllServices() {
		
		return medicalDAO.listAllServices();
	}

	@Override
	@Transactional
	public void saveMedicalService(Services medicalservice) {
		
		medicalDAO.saveMedicalService(medicalservice);
		
	}

	@Override
	@Transactional
	public Services getService(int id) {
		
		Services service=medicalDAO.getService(id);
		return service;
	}

	@Override
	@Transactional
	public void delete(int theId) {
		// TODO Auto-generated method stub
		medicalDAO.delete(theId);
	}



}
