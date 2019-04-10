package com.cts.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.UserLogin;


@Repository("userlogindao")
public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public UserLogin findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(UserLogin.class,username);
	
	}
}
