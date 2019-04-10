package com.cts.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.Doctor;
import com.cts.entity.Services;

@Repository("medicalServiceDAO")
public class MedicalServiceDAOImpl implements MedicalServiceDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Services> listAllServices() {
		
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Services> cq=cb.createQuery(Services.class);
		Root<Services> root =cq.from(Services.class);
		cq.select(root);
		Query query =session.createQuery(cq);
		return query.getResultList();
	}
	
	@Override
	public void saveMedicalService(Services medicalservice) {
		
		System.out.println(medicalservice);
		sessionFactory.getCurrentSession().saveOrUpdate(medicalservice);
		
	}
	
	@Override
	public Services getService(int id) {
		Session session=sessionFactory.getCurrentSession();
		Services theService =session.get(Services.class,id);
		return theService;
		
	}

	@Override
	public void delete(int theId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		System.out.println("In DAOOOO");
		Services services  =session.byId(Services.class).load(theId);
		session.delete(services);
	}
	
	

}
