package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_table")
public class Admin {

	public Admin(){
		super();
	}
	
	@Id
	@Column(name="Admin_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="First_Name",length=50)
	String firstname;
	
	@Column(name="Last_Name",length=50)
	String lastname;
	
	@Column(name="Age")
	int age;
	
	@Column(name="Gender")
	String gender;
	
	@Column(name="DOB",length=10)
	String dob;
	
	@Column(name="Contact_Number",length=10)
	long contactnumber;
	
	@Column(name="Alt_Contact_Number",length=10)
	long atlcontactnumber;
	
	@Column(name="Email_Id",length=50)
	String email;
	
	@Column(name="password",length=15)
	String password;
	
	String authority;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}

	public long getAtlcontactnumber() {
		return atlcontactnumber;
	}

	public void setAtlcontactnumber(long atlcontactnumber) {
		this.atlcontactnumber = atlcontactnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Admin(int id, String firstname, String lastname, int age, String gender, String dob, long contactnumber,
			long atlcontactnumber, String email, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.contactnumber = contactnumber;
		this.atlcontactnumber = atlcontactnumber;
		this.email = email;
		this.password = password;
		authority="ROLE_ADMIN";
	}

	public Admin(String firstname, String lastname, int age, String gender, String dob, long contactnumber,
			long atlcontactnumber, String email, String password) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.contactnumber = contactnumber;
		this.atlcontactnumber = atlcontactnumber;
		this.email = email;
		this.password = password;
		authority="ROLE_ADMIN";
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender="
				+ gender + ", dob=" + dob + ", contactnumber=" + contactnumber + ", atlcontactnumber="
				+ atlcontactnumber + ", email=" + email + ", password=" + password + ", authority=" + authority + "]";
	}


	
	
}
