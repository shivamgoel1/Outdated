package com.cts.dao;

import com.cts.entity.UserLogin;

public interface LoginDAO {
	UserLogin findUserByUsername(String username);
}
