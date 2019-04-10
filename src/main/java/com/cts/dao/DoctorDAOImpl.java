	package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.CheckupRequest;
import com.cts.entity.Doctor;
import com.cts.entity.UserLogin;

@Repository("doctorDAO")
public class DoctorDAOImpl implements DoctorDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveDoctor(Doctor doctor) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(doctor);
		
	}


	@Override
	public Doctor getDoctor(String id) {
		Session session=sessionFactory.getCurrentSession();
		
//		
//		Criteria crit = session.createCriteria(Doctor.class);
//		crit.add(Restrictions.eq("Email_Id",id));
//		Doctor doctor= new Doctor();
		
//		List<Doctor> results = crit.list();
			
				//System.out.println(i+"````````");
//				System.out.println(results+" yes");
		
	UserLogin login=session.get(UserLogin.class,id);
	int i= login.getId();
	Doctor theDoctor =session.get(Doctor.class,id);
	System.out.println(theDoctor);
		return theDoctor;
		
	}


	@Override
	public List<CheckupRequest> getRequest(String p) {
		
		
		
		// NOT A GOOD PRACTICE TO HIT DATABASE TABLES DIRECTLY 
		
		
//		Session session =sessionFactory.getCurrentSession();
//		String sql="select doctor_table.*,checkup_request_tab.*\r\n" + 
//				"  from doctor_table\r\n" +  
//				"  join checkup_request_tab\r\n" + 
//				"    on doctor_table.Doctor_ID\r\n" + 
//				"     = checkup_request_tab.Doctor_ID\r\n" + 
//				" where checkup_request_tab.Status = 'pending' ";
//		 
//		SQLQuery query = session.createSQLQuery(sql);
//		//query.addEntity(Doctor.class); 
//		query.addEntity(CheckupRequest.class);
//		List <CheckupRequest>results = query.list(); 
//		for(CheckupRequest checkupRequest : results) {
//			System.out.println(checkupRequest.getDate());
//			System.out.println(checkupRequest.getDid());
//			System.out.println(checkupRequest.getStatus());
//		}
//		System.out.println(results.toString());
//		return results;
		
		Session session=sessionFactory.getCurrentSession();
		
		UserLogin login=session.get(UserLogin.class,p);
		int i= login.getId();
		System.out.println(i+"id!!!");
		CriteriaBuilder cb=session.getCriteriaBuilder();
		
		CriteriaQuery<Doctor> query = cb.createQuery(Doctor.class);
		Root<Doctor> doctor = query.from(Doctor.class);
		Join<CheckupRequest,Doctor> request=doctor.join("requests");
		query.select(request).where(cb.equal(request.get("did"),i),cb.equal(request.get("status"),"pending"));
		Query pop =session.createQuery(query);
		List<CheckupRequest> results = pop.getResultList();
		return results;
	}

	
	@Override
	public List<CheckupRequest> getAcceptedRequests(int id) {
		
		Session session=sessionFactory.getCurrentSession();
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		
		CriteriaQuery<Doctor> query = cb.createQuery(Doctor.class);
		Root<Doctor> doctor = query.from(Doctor.class);
		Join<CheckupRequest,Doctor> request=doctor.join("requests");
		
		query.select(request).where(cb.equal(request.get("did"),id),cb.equal(request.get("status"),"Accepted"));
		   
		
		
		Query pop =session.createQuery(query);
		List<CheckupRequest> results = pop.getResultList();
		return results;
		
	}


	@Override
	public List<CheckupRequest> getReports(int id) {
		
		Session session=sessionFactory.getCurrentSession();
		
		CriteriaBuilder cb=session.getCriteriaBuilder();
		
		CriteriaQuery<Doctor> query = cb.createQuery(Doctor.class);
		Root<Doctor> doctor = query.from(Doctor.class);
		Join<CheckupRequest,Doctor> request=doctor.join("requests");
	
		query.select(request).where(cb.equal(request.get("did"),id),cb.equal(request.get("status"),"Finished"));
		
		Query pop =session.createQuery(query);
		List<CheckupRequest> results = pop.getResultList();

		return results;
	}	
	
	
	@Override
	public List<Doctor> doctorList() {
		
		Session session=sessionFactory.getCurrentSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Doctor> cq=cb.createQuery(Doctor.class);
		Root<Doctor> root =cq.from(Doctor.class);
		cq.select(root);
		Query query =session.createQuery(cq);
		System.out.println("YOLOOOO"+query.getResultList());
		return query.getResultList();
	}


	@Override
	public void deleteDoctor(int id) {

		Session session=sessionFactory.getCurrentSession();
		System.out.println("In DAOOOO");
		Doctor doctor =session.byId(Doctor.class).load(id);
		session.delete(doctor);
		
	}	

	@Override
	public List getTotalRequests(String id) {
		Session session=sessionFactory.getCurrentSession();
		UserLogin login=session.get(UserLogin.class,id);
		int i= login.getId();
		 Criteria criteria = session.createCriteria(CheckupRequest.class);
		 
		 Query query = session
		            .createQuery("SELECT Count(*) FROM CheckupRequest where Doctor_ID =:id and Status =:status");
		 Query query1= session
		            .createQuery("SELECT Count(*) FROM CheckupRequest where Doctor_ID =:id and Status =:status");
		 Query query2= session
		            .createQuery("SELECT Count(*) FROM CheckupRequest where Doctor_ID =:id and Status =:status");
		 Query query3= session
		            .createQuery("SELECT Count(*) FROM Services");
		 query.setParameter("id",i);
		 query.setParameter("status","pending");
		 query1.setParameter("id",i);
		 query1.setParameter("status","Finished");
		 query2.setParameter("id",i);
		 query2.setParameter("status","Accepted");
		 List result = query.getResultList();
		 result.add(query1.getSingleResult());
		 result.add(query2.getSingleResult());
		 result.add(query3.getSingleResult());
		 
		
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


	@Override
	public Doctor getDoctorById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Doctor theDoctor =session.get(Doctor.class,id);
		System.out.println(theDoctor);
			return theDoctor;
		
	}
	
}
