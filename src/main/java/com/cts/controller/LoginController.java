package com.cts.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.Admin;
import com.cts.entity.Customer;
import com.cts.entity.Doctor;
import com.cts.entity.UserLogin;
import com.cts.service.AdminService;
import com.cts.service.CustomerService;
import com.cts.service.DoctorService;
import com.cts.service.UserLoginService;

@Controller
public class LoginController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	DoctorService doctorService;
	
	
	@GetMapping("/registerCustomer")
	public String showForm(Model model){
		return "finalUserRegistration";
	}
	@GetMapping("/registerAdmin")
	public String showForm1(Model model){
		return "finalAdminRegistration";
	}
	
	@GetMapping("/registerDoctor")
	public String showForm2(Model model){
		
		return "finalDoctorRegistration";
	}
	
	@PostMapping("/saveCustomer")
	public String registerCustomer(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
			@RequestParam("age") int age,@RequestParam("gender") String gender,@RequestParam("dob") String dob,
			@RequestParam("contactnumber") long  contactnumber,@RequestParam("altcontactnumber") long altcontactnumber,
			@RequestParam("emailid") String emailid,@RequestParam("password") String password,@RequestParam("addressline") String addressline,
			@RequestParam("addressline2") String addressline2,@RequestParam("city") String city,@RequestParam("state") String state,
			@RequestParam("zipcode") String zipcode,Model model
			){
		 String encoded=new BCryptPasswordEncoder().encode(password);
		 System.out.println((age)+"    "+(contactnumber));
		 Customer customer= new Customer( firstname, lastname,age, gender, dob, (contactnumber),(altcontactnumber), emailid, encoded, addressline, addressline2, city, state, zipcode);
		 System.out.println(customer);
		 customerService.registerUser(customer);
		 int id = customer.getId();
		 UserLogin login= new UserLogin(emailid,encoded,customer.getAuthority(),id);
		 userLoginService.registerUser(login);
		 model.addAttribute("alertMsg","true");
		return "login";
	}
	
	@PostMapping("/saveAdmin")
	public String registerAdmin(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastname,
			@RequestParam("age") int age,@RequestParam("gender") String gender,@RequestParam("dob") String dob,
			@RequestParam("contactNumber") long contactnumber,@RequestParam("altcontactNumber") long altcontactnumber,
			@RequestParam("emailid") String emailid,@RequestParam("password") String password, Model model){
				
			String encoded=new BCryptPasswordEncoder().encode(password);
			Admin admin= new Admin(firstName,lastname,age,gender,dob,contactnumber,altcontactnumber,emailid,password);
			adminService.registerUser(admin);
			int id = admin.getId();
			UserLogin login= new UserLogin(emailid,encoded,admin.getAuthority(),id);
			userLoginService.registerUser(login);
			model.addAttribute("alertMsg","true");
			return "login";
		}
	
	@PostMapping("/saveDoctor")
	public String saveDoctor(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastname,
			@RequestParam("age") int age,@RequestParam("gender") String gender,@RequestParam("dob") String dob,
			@RequestParam("contactNumber") long contactnumber,@RequestParam("altcontactNumber") long altcontactnumber,
			@RequestParam("emailid") String emailid,@RequestParam("password") String password,@RequestParam("addressline") String addressline,
	@RequestParam("addressline2") String addressline2,@RequestParam("city") String city,@RequestParam("state") String state,
	@RequestParam("zipcode") String zipcode ,@RequestParam("degree") String degree,@RequestParam("speciality") String speciality,
	@RequestParam("hoursList") String hoursList,@RequestParam("hospital") String hospital
			,Model model){
		String encoded=new BCryptPasswordEncoder().encode(password);
		Doctor doctor = new Doctor(firstName, lastname, age, gender, dob, contactnumber, altcontactnumber, emailid, password, 
				addressline, addressline2, city, state, zipcode, degree, speciality, hoursList, hospital);
		doctorService.saveDoctor(doctor);
		UserLogin login= new UserLogin(emailid,encoded,doctor.getAuthority(),doctor.getId());
		userLoginService.registerUser(login);
		model.addAttribute("alertMsg","true");
		return "login";
	}
	
	
    @RequestMapping(value="/logout", method=RequestMethod.GET)  
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {  
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
        if (auth != null){      
           new SecurityContextLogoutHandler().logout(request, response, auth);  
        }  
         return "redirect:/login";  
     }  
	
}
