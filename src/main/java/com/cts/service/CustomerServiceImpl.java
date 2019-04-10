package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.CustomerDAO;
import com.cts.entity.CheckupRequest;
import com.cts.entity.Customer;
import com.cts.entity.Doctor;
import com.cts.entity.Services;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	  private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public void registerUser(Customer customer) {
		customerDAO.registerUser(customer);
	}

	@Autowired
	CustomerDAO customerdao;
	
	@Override
	@Transactional
	public List<Services> serviceList() {
		// TODO Auto-generated method stub
		return customerdao.serviceList();
	}

	@Override
	@Transactional
	public List<Doctor> doctorList() {
		// TODO Auto-generated method stub
		return customerdao.doctorList();
	}

	@Override
	@Transactional
	public Customer getCustomer(String p) {
		// TODO Auto-generated method stub
		Customer customer=customerDAO.getCustomer(p);
		return customer;
	}

	@Override
	@Transactional
	public void saveRequest(CheckupRequest request) {
		// TODO Auto-generated method stub
		customerdao.saveRequest(request);
		
	}
	
	@Override
	@Transactional
	public List<CheckupRequest> getRequest(String p) {
		// TODO Auto-generated method stub
		List<CheckupRequest> list=customerdao.getRequest(p);
		return list;
	}
	
	@Override
	@Transactional
	public List<CheckupRequest> getReports(int id) {

		List<CheckupRequest> results = customerdao.getReports(id);
		
		return results;


}

	@Override
	@Transactional
	public List<Customer> allCustomer() {
		// TODO Auto-generated method stub
		return customerdao.allCustomers();
	}

	@Override
	@Transactional
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerdao.getCustomerById(id);
	}
	
	@Override
	@Transactional
	public List getTotalRequests(String id) {
		// TODO Auto-generated method stub
		return customerdao.getTotalRequests(id);
	}

	@Override
	@Transactional 
	public void delete(int theId) {
		// TODO Auto-generated method stub
		customerdao.delete(theId);
		
	}

}
