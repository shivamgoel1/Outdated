package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.DoctorDAO;
import com.cts.entity.CheckupRequest;
import com.cts.entity.Doctor;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	DoctorDAO doctorDAO;

	@Override
	@Transactional
	public void saveDoctor(Doctor doctor) {
		
		doctorDAO.saveDoctor(doctor);
		
	}

	@Override
	@Transactional
	public List<Doctor> doctorList() {
	
		System.out.println("HEllo Service ");
		return doctorDAO.doctorList();
	}


	@Override
	@Transactional
	public void deleteDoctor(int id) {

		System.out.println("In Service");
		doctorDAO.deleteDoctor(id);
		
	}
	
	
	@Override
	@Transactional
	public Doctor getDoctor(String p) {
		System.out.println(p+"int the service");
		Doctor doctor=doctorDAO.getDoctor(p);
		return doctor;
	}


	@Override
	@Transactional
	public List<CheckupRequest> getRequest(String p) {
		// TODO Auto-generated method stub
		List<CheckupRequest> list=doctorDAO.getRequest(p);
		return list;
	}

	@Override
	@Transactional
	public List<CheckupRequest> getAcceptedRequests(int id) {
		
		List<CheckupRequest> results = doctorDAO.getAcceptedRequests(id);
		
		return results;
	}


	@Override
	@Transactional
	public List<CheckupRequest> getReports(int id) {

		List<CheckupRequest> results = doctorDAO.getReports(id);
		
		return results;


}

	@Override
	@Transactional
	public List getTotalRequests(String id) {
		// TODO Auto-generated method stub
		return doctorDAO.getTotalRequests(id);
	}

	@Override
	@Transactional
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		return doctorDAO.getDoctorById(id);
	}
	

}
