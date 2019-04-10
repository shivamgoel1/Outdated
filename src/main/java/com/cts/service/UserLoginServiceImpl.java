package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.UserLoginDAO;
import com.cts.entity.UserLogin;

@Service("userlogwin")

public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	  private UserLoginDAO userLoginDAO;
	
	@Override
	@Transactional
	public void registerUser(UserLogin userLogin) {
		// TODO Auto-generated method stub
		userLoginDAO.registerUser(userLogin);
		
	}

}
