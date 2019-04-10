package com.cts.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.CheckupRequest;

@Repository("requestDAO")
public class RequestDAOImpl implements RequestDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveRequest(CheckupRequest request) {

		System.out.println("INSIDE DAO 1 state");
		sessionFactory.getCurrentSession().saveOrUpdate(request);
		System.out.println("INSIDE DAO 2 state");
		
	}
	
	@Override
	public CheckupRequest getRequest(int id) {
		Session session=sessionFactory.getCurrentSession();
		CheckupRequest theRequest =session.get(CheckupRequest.class,id);
		return theRequest;
	}
	

}
