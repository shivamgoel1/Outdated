package com.cts.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.CheckupRequest;
import com.cts.entity.Customer;
import com.cts.entity.Doctor;
import com.cts.entity.Services;
import com.cts.service.CustomerService;
import com.cts.service.MedicalServService;
import com.cts.service.UserLoginService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	UserLoginService userLoginService;
	
	@Autowired
	MedicalServService medicalService;
	
	@GetMapping("/allCustomers")
	public String allCustomers(Model model) {
		List<Customer> list=customerService.allCustomer();
		model.addAttribute("list",list);
		return "allcustomersTest";
	}
	
	@PostMapping("/saveAdminCustomer")
	public String saveAdminCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.registerUser(customer);
		return "redirect:/customer/allCustomers";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.registerUser(customer);
		return "testCustomer";
	}
	
	@GetMapping("/updateCustomerAdmin")
	public String updateCustomerAdmin(Model model,@RequestParam("id") int id) {
		Customer customer= customerService.getCustomerById(id);
		model.addAttribute("customer",customer);
		return "admincustomerUpdateTest";
	} 
	
	
	@GetMapping("/updateCustomer")
	public String updateCustomer(Model model,Principal principal) {
		String username= principal.getName();
		Customer customer= customerService.getCustomer(username);
		System.out.println(customer+"IN UPDATE CUSTOMER"); 
		model.addAttribute("customer",customer);  
		return "customerUpdateTest";  
	} 
	
	
	@GetMapping("/viewcustomerdetailse")
	public String viewcustomerdetailse(@RequestParam("id") int id,Model model) {
		System.out.println(id+"Error is here");
		Customer customer= customerService.getCustomerById(id);
		model.addAttribute("customer",customer);
		return "admincustomerTest";
	}
	
	@GetMapping("/servicelist")
	public String serviceList(Model model,Principal principal) {
		
		String username= principal.getName();
		//List<Services> list = customerService.serviceList();
		Customer customer = customerService.getCustomer(username);
		List request = customerService.getTotalRequests(username);
		String s = String.valueOf(request.get(1));
		//int i = Integer.parseInt(s);
		model.addAttribute("requests",request.get(0));
		model.addAttribute("doctors",request.get(4));
		model.addAttribute("username",username);
		model.addAttribute("reports",s);
		model.addAttribute("appointments",request.get(2));
		model.addAttribute("services",request.get(3));
		model.addAttribute("customer", customer);
		//model.addAttribute("service",list);
		return "testCustomer";
	}
	
	@GetMapping("/doctorList")
public String doctorList(Model model) {
		
		List<Doctor> list = customerService.doctorList();
		System.out.println("doctor"+list);
		model.addAttribute("doctor",list);
		return "customerdoctorlistTest";
	}
	
	@GetMapping("/viewMakeRequests")
	public String makeRequest(Model model){
		return "requestFormTest";
		
	}
	
	@PostMapping("/saveRequest")
	public String saveRequest(@RequestParam("doctorid") String doctorid, @RequestParam("appointmentdate") String date,
			@RequestParam("medicare") int serviceid,Principal principal){
		String username= principal.getName();
		Customer customer = customerService.getCustomer(username);
		int cid= customer.getId();
		Services service=medicalService.getService(serviceid);
		int d1_normal=service.getD1_normal();
		int d2_normal=service.getD2_normal();
		CheckupRequest checkupRequest= new CheckupRequest(cid,doctorid,serviceid,date,d1_normal,d2_normal);
		customerService.saveRequest(checkupRequest);
		return "redirect:/customer/servicelist";
	}
	
	
	@GetMapping("/viewRequest")
	public String viewDoctorRequests(Principal principal,Model theModel)
	{
		/*Doctor  doctor =doctorService.getDoctorRequests(Id);*/
		String username = principal.getName();
		List<CheckupRequest> list =customerService.getRequest(username);
		System.out.println(list);
		theModel.addAttribute("requestlist",list);
		
		return "customerRequestTest";
	
	}
	
	
	@GetMapping("/viewReports")
	public String viewReports(Model theModel,Principal principal)
	{
		String username = principal.getName();
		Customer customer=customerService.getCustomer(username);
		int id= customer.getId();
		List<CheckupRequest> results = customerService.getReports(id);
		System.out.println(results+"reports~~~~~");
		theModel.addAttribute("requests",results);
	 
		return "customerReportsTest";
	
	}
	
	
	@GetMapping("/delete")
	public String deleteDoctor(@RequestParam("id") int theId, Model model)
	{
		customerService.delete(theId);
		System.out.println("In controller");
		return "redirect:/customer/allCustomers";    
	}
	
}
