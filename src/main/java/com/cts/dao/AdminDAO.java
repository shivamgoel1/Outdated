package com.cts.dao;

import java.util.List;

import com.cts.entity.Admin;

public interface AdminDAO {
	public void registerUser(Admin admin);
	public Admin getAdmin(String p);
	public List getTotalRequests(String id);
}
