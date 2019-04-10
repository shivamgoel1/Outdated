package com.cts.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.Admin;
import com.cts.entity.CheckupRequest;
import com.cts.entity.Customer;
import com.cts.entity.UserLogin;

@Repository("adminDAO")
public class AdminDAOImpl implements AdminDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void registerUser(Admin admin) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(admin);
		
	}

	@Override
	public Admin getAdmin(String p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		System.out.println(p+"int he DAOImpl");
		
		
		UserLogin login=session.get(UserLogin.class,p);
		int i= login.getId();
		Admin admin=session.get(Admin.class,i);
		System.out.println(admin);
		return admin;
		
	}
	@Override
	public List getTotalRequests(String id) {
		Session session=sessionFactory.getCurrentSession();
		UserLogin login=session.get(UserLogin.class,id);
		int i= login.getId();
		 Criteria criteria = session.createCriteria(CheckupRequest.class);
		 
		 Query query2= session
		            .createQuery("SELECT Count(*) FROM Customer");
		 Query query3= session
		            .createQuery("SELECT Count(*) FROM Services");
		 Query query4= session
		            .createQuery("SELECT Count(*) FROM Doctor");

		 List result = query2.getResultList();      
		 result.add(query3.getSingleResult());
		 result.add(query4.getSingleResult());
		 
		
//		 int idi = Integer.parseInt(result.indexOf(0)); 
		 System.out.println(result.get(0)+" scfzdv"+result.get(1));
//         criteria.setProjection(Projections.rowCount()).add(Restrictions.eq("did", i));
//         String employees = Integer.toString(criteria.list());
//         ArrayList<String> list = new ArrayList<String>();
//         list= (ArrayList<String>) criteria.list();
         //System.out.println(employees.indexOf(0));
//         Integer rowCount = (Integer) employees.get(0);
         
//         List results = session.createCriteria(CheckupRequest.class)
//        		    .setProjection( Projections.rowCount() )
//        		    .add( Restrictions.eq("did", i) )  
//        		    .list();
         //System.out.println(results);
         
		return result;
	}
	

}
