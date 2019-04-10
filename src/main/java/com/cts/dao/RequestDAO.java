package com.cts.dao;

import com.cts.entity.CheckupRequest;

public interface RequestDAO {
	
	public  CheckupRequest getRequest(int id);
	//List<CheckupRequest> listCustomerRequests();
	void saveRequest(CheckupRequest request);

}
