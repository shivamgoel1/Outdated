package com.cts.service;

import java.util.List;

import com.cts.entity.CheckupRequest;
import com.cts.entity.Doctor;


public interface DoctorService {
	
	void  saveDoctor(Doctor doctor);
	public Doctor getDoctor(String theId);
	public List<CheckupRequest> getRequest(String p);
	public List<CheckupRequest> getAcceptedRequests(int id);
	public List<CheckupRequest> getReports(int id);
	List<Doctor> doctorList();
	public void deleteDoctor(int id);
	public List getTotalRequests(String id);
	public Doctor getDoctorById(int id);

}
