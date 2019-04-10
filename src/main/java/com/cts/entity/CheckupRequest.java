package com.cts.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;


@Entity
@Table(name="checkup_request_tab")
public class CheckupRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	int id;
	
	@Column(name="Customer_ID")
	int cid;
	
	@Column(name="Doctor_ID",length=10)
	String did;

	@Column(name="Medicare_Service_ID")
	int serviceID;
		
	@NotNull
	@Column(name="appointment_date")
	String date;
	
	@Column(name="Status",length=30)
	String status;
	
	@Column(name="Result",length=500)
	String result;
	
	@Column(name="D1_Actual_value")
	int d1_actual;
	
	@Column(name="D1_Normal_value")
	int d1_normal;
	
	@Column(name="D2_Actual_value")
	int d2_actual;
	
	@Column(name="D2_Normal_value")
	int d2_normal;
	
	@Column(name="Doctor_Comments",length=200)
	String comment;
	
	@Column(name="Other_Information",length=200)
	String other_info;

	@NotNull
	@Column(name="Result_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date result_date;

	public CheckupRequest(int cid, String did, int serviceID, String date) {
		super();
		this.cid = cid;
		this.did = did;
		this.serviceID = serviceID;
		this.date = date;
		status="pending";
		this.d1_actual = 0;
		this.d1_normal = 0;
		this.d2_actual = 0;
		this.d2_normal = 0;
	}
	
	public CheckupRequest(int cid, String did, int serviceID, String date, int d1_normal,int d2_normal) {
		super();
		this.cid = cid;
		this.did = did;
		this.serviceID = serviceID;
		this.date = date;
		status="pending";
		this.d1_actual = 0;
		this.d1_normal = d1_normal;
		this.d2_actual = 0;
		this.d2_normal = d2_normal;
	}
	

	

	public CheckupRequest(int id, int cid, String did, int serviceID, String date, String result, int d1_actual,
			int d1_normal, int d2_actual, int d2_normal, String comment, String other_info, Date result_date) {
		super();
		this.id = id;
		this.cid = cid;
		this.did = did;
		this.serviceID = serviceID;
		this.date = date;
		this.result = result;
		this.d1_actual = d1_actual;
		this.d1_normal = d1_normal;
		this.d2_actual = d2_actual;
		this.d2_normal = d2_normal;
		this.comment = comment;
		this.other_info = other_info;
		this.result_date = result_date;
		status="pending";
	}





	public Date getResult_date() {
		return result_date;
	}





	public void setResult_date(Date result_date) {
		this.result_date = result_date;
	}





	public int getD1_actual() {
		return d1_actual;
	}

	public void setD1_actual(int d1_actual) {
		this.d1_actual = d1_actual;
	}

	public int getD1_normal() {
		return d1_normal;
	}

	public void setD1_normal(int d1_normal) {
		this.d1_normal = d1_normal;
	}

	public int getD2_actual() {
		return d2_actual;
	}

	public void setD2_actual(int d2_actual) {
		this.d2_actual = d2_actual;
	}

	public int getD2_normal() {
		return d2_normal;
	}

	public void setD2_normal(int d2_normal) {
		this.d2_normal = d2_normal;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getOther_info() {
		return other_info;
	}

	public void setOther_info(String other_info) {
		this.other_info = other_info;
	}

	public CheckupRequest() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getDid() {
		return did;
	}

	public void setDid(String did) {
		this.did = did;
	}

	public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}





	@Override
	public String toString() {
		return "CheckupRequest [id=" + id + ", cid=" + cid + ", did=" + did + ", serviceID=" + serviceID + ", date="
				+ date + ", status=" + status + ", result=" + result + ", d1_actual=" + d1_actual + ", d1_normal="
				+ d1_normal + ", d2_actual=" + d2_actual + ", d2_normal=" + d2_normal + ", comment=" + comment
				+ ", other_info=" + other_info + ", result_date=" + result_date + "]";
	}


	
	
	
}