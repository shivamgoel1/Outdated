package com.cts.dao;

import java.util.List;

import com.cts.entity.CheckupRequest;
import com.cts.entity.Customer;
import com.cts.entity.Doctor;
import com.cts.entity.Services;

public interface CustomerDAO {
 public List<Services> serviceList();
 public List<Doctor> doctorList();
	public void registerUser(Customer customer);
	public Customer getCustomer(String p);
	public void saveRequest(CheckupRequest request);
	public List<CheckupRequest> getRequest(String p);
	public List<CheckupRequest> getReports(int id);
	public List<Customer> allCustomers();
	public Customer getCustomerById(int id);
	public List getTotalRequests(String id);
	public void delete(int theId);
}
