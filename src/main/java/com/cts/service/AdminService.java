package com.cts.service;

import java.util.List;

import com.cts.entity.Admin;
import com.cts.entity.Doctor;

public interface AdminService {
	public void registerUser(Admin admin);
	public Admin getAdmin(String p);
	public List getTotalRequests(String id);
	
}
