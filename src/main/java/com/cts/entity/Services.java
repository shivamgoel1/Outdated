package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicare_services_table")
public class Services {
	
	public Services() {
		
	}
	
	@Id
	@Column(name="medicare_service_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int medicare_service_id;
	
	@Column(name="medicare_service",length=50,unique=true)
	String medicare_service;	
	
	
	
	@Column(name="service_description",length=100)
	String service_description;
	
	@Column(name="amount",length=10)
	int amount;
	
	@Column(name="D1_Range",length=10)
	int d1_normal;
	
	@Column(name="D2_Range",length=10)
	int d2_normal;
	
	
	
	public int getD1_normal() {
		return d1_normal;
	}

	public void setD1_normal(int d1_normal) {
		this.d1_normal = d1_normal;
	}

	public int getD2_normal() {
		return d2_normal;
	}

	public void setD2_normal(int d2_normal) {
		this.d2_normal = d2_normal;
	}

	public Services(int medicare_service_id, String medicare_service, String service_description, int d1_normal,
			int d2_normal, int amount) {
		super();
		this.medicare_service_id = medicare_service_id;
		this.medicare_service = medicare_service;
		this.service_description = service_description;
		this.d1_normal = d1_normal;
		this.d2_normal = d2_normal;
		this.amount = amount;
	}


	public int getMedicare_service_id() {
		return medicare_service_id;
	}

	public void setMedicare_service_id(int medicare_service_id) {
		this.medicare_service_id = medicare_service_id;
	}

	public String getMedicare_service() {
		return medicare_service;
	}

	public void setMedicare_service(String medicare_service) {
		this.medicare_service = medicare_service;
	}



	public String getService_description() {
		return service_description;
	}

	public void setService_description(String service_description) {
		this.service_description = service_description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Services [medicare_service_id=" + medicare_service_id + ", medicare_service=" + medicare_service
				+ ", service_description=" + service_description + ", amount=" + amount + "]";
	}

	
	
	

	
	
	
}
