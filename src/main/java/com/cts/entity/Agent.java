package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Agent_Table")
public class Agent {

	public Agent(){
		super();
	}
	
	@Id
	@Column(name="Agent_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="First_Name",length=50)
	String firstname;
	
	@Column(name="Last_Name",length=50)
	String lastname;
	
	@Column(name="Age")
	int age;
	
	@Column(name="Gender",length=10)
	String gender;
	
	@Column(name="DOB",length=10)
	String dob;
	
	@Column(name="Contact_Number",length=10)
	String contactnumber;
	
	@Column(name="Alt_Contact_Number",length=10)
	String atlcontactnumber;
	
	@Column(name="Email_Id",length=50)
	String email;
	
	@Column(name="password",length=15)
	String password;
	
	@Column(name="Address_Line1",length=100)
	String addressline1;
	
	@Column(name="Address_Line2",length=100)
	String addressline2;
	
	@Column(name="City",length=50)
	String city;
	
	@Column(name="State",length=50)
	String state;
	
	@Column(name="Zipcode",length=10)
	String zipcode;

	public Agent(int id, String firstname, String lastname, int age, String gender, String dob, String contactnumber,
			String atlcontactnumber, String email, String password, String addressline1, String addressline2,
			String city, String state, String zipcode) {
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
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

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

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getAtlcontactnumber() {
		return atlcontactnumber;
	}

	public void setAtlcontactnumber(String atlcontactnumber) {
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

	public String getAddressline1() {
		return addressline1;
	}

	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}

	public String getAddressline2() {
		return addressline2;
	}

	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender="
				+ gender + ", dob=" + dob + ", contactnumber=" + contactnumber + ", atlcontactnumber="
				+ atlcontactnumber + ", email=" + email + ", password=" + password + ", addressline1=" + addressline1
				+ ", addressline2=" + addressline2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ "]";
	}
	
	
}


