package com.cts.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctor_table")
public class Doctor {
	
	//copy agent table and add some more fields from given documents
	public Doctor(){
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "StoreIdSequenceGenerator")  
//    @SequenceGenerator(name = "StoreIdSequenceGenerator", sequenceName = "store_storeid_seq")  
	@Column(name="Doctor_ID")
	int id;
	
	@Column(name="First_Name",length=50)
	String firstname;
	
	@Column(name="Last_Name",length=50)
	String lastname;
	
	@Column(name="Age")
	int age;
	
	@Column(name="Gender",length=10)
	String gender;
	
	@Column(name="DOB",length=20)
	String dob;
	
	@Column(name="Contact_Number",length=10)
	long contactnumber;
	
	@Column(name="Alt_Contact_Number",length=10)
	long atlcontactnumber;
	
	@Column(name="Email_Id",length=50,unique = true, nullable = false)
	String email;
	
	@Column(name="password",length=100)
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
	
	@Column(name="Degree",length=50)
	String degree;
	
	@Column(name="Specialty",length=50)
	String specialty;
	

	@Column(name="Work_hours",length=50)
	String work_hours;
	
	@Column(name="Hospital",length=50)
	String hospital;
	
	@Column(name="Medical_Service_Id",length=50)
	int medical_service_id;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy="did",fetch=FetchType.EAGER)
	private List<CheckupRequest> requests = new ArrayList<>();
	


	
	public Doctor(int id, String firstname, String lastname, int age, String gender, String dob, long contactnumber,
			long atlcontactnumber, String email, String password, String addressline1, String addressline2, String city,
			String state, String zipcode, String degree, String specialty, String work_hours, String hospital,
			int medical_service_id, List<CheckupRequest> requests) {
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
		this.degree = degree;
		this.specialty = specialty;
		this.work_hours = work_hours;
		this.hospital = hospital;
		this.medical_service_id = medical_service_id;
		this.requests = requests;
		authority="ROLE_DOCTOR";
	}

	public List<CheckupRequest> getRequests() {
		return requests;
	}

	public void setRequests(List<CheckupRequest> requests) {
		this.requests = requests;
	}
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

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getWork_hours() {
		return work_hours;
	}

	public void setWork_hours(String work_hours) {
		this.work_hours = work_hours;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public int getMedical_service_id() {
		return medical_service_id;
	}

	public void setMedical_service_id(int medical_service_id) {
		this.medical_service_id = medical_service_id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Doctor(int id, String firstname, String lastname, int age, String gender, String dob, long contactnumber,
			long atlcontactnumber, String email, String password, String addressline1, String addressline2, String city,
			String state, String zipcode, String degree, String specialty, String work_hours, String hospital,
			int medical_service_id) {
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
		this.degree = degree;
		this.specialty = specialty;
		this.work_hours = work_hours;
		this.hospital = hospital;
		this.medical_service_id = medical_service_id;
		authority="ROLE_DOCTOR";
	}

	public Doctor(String firstname, String lastname, int age, String gender, String dob, long contactnumber,
			long atlcontactnumber, String email, String password, String addressline1, String addressline2, String city,
			String state, String zipcode, String degree, String specialty, String work_hours, String hospital
			) {
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
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.degree = degree;
		this.specialty = specialty;
		this.work_hours = work_hours;
		this.hospital = hospital;
		authority="ROLE_DOCTOR";
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", gender="
				+ gender + ", dob=" + dob + ", contactnumber=" + contactnumber + ", atlcontactnumber="
				+ atlcontactnumber + ", email=" + email + ", password=" + password + ", addressline1=" + addressline1
				+ ", addressline2=" + addressline2 + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode
				+ ", degree=" + degree + ", specialty=" + specialty + ", work_hours=" + work_hours + ", hospital="
				+ hospital + ", medical_service_id=" + medical_service_id + ", authority=" + authority + "]";
	}
	
	
	
}
