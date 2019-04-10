package com.cts.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.UserLogin;


@Repository("userlogin")
public class UserLoginDAOImpl implements UserLoginDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void registerUser(UserLogin userLogin) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(userLogin);
		
	}

}
