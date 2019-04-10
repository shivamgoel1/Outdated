package com.cts.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.cts.entity.Services;
import com.cts.service.MedicalServService;

@Controller
@RequestMapping("/service")
public class MedicalServiceController {
	
	@Autowired
	MedicalServService medicalService;
	
	
	@GetMapping("/listServicesDoctor")
	public String getAllServices(Model model ) 
	{
		List<Services>lb=medicalService.listAllServices();
		model.addAttribute("service",lb);
		return "medicareServiceDoctorTest";
	}
	
	@GetMapping("/listServicesAdmin")
	public String getAllServicesAdmin(Model model ) 
	{
		List<Services>lb=medicalService.listAllServices();
		model.addAttribute("service",lb);
		return "medicareServiceAdminTest";
	}
	
	@GetMapping("/listServicesCustomer")
	public String getAllServicesCustomer(Model model ) 
	{
		List<Services>lb=medicalService.listAllServices();
		model.addAttribute("service",lb); 
		return "medicareServiceCustomerTest";
	}
	
	@GetMapping("/view")
	public String viewService(@RequestParam("serviceId") int theId , Model model)
	{
	
		System.out.println("Hello"+theId);
		
		Services theService=medicalService.getService(theId);
		System.out.println(theService+"world");
		//System.out.println(theService);
//		List<Services>lb=medicalService.listAllServices();
//		model.addAttribute("service",lb);
		model.addAttribute("description",theService);
		
		return "medicareServiceDoctorTestDescription"; 
	}
	

	@GetMapping("/viewCustomer")
	public String viewServiceCustomer(@RequestParam("serviceId") int theId , Model model)
	{
	
		System.out.println("Hello"+theId);
		
		Services theService=medicalService.getService(theId); 
		System.out.println(theService+"world");
		//System.out.println(theService);

		model.addAttribute("description",theService);
		
		return "servicedetailscustomerTest";
	}
	
	@GetMapping("/viewAdmin")
	public String viewServiceAdmin(@RequestParam("serviceId") int theId , Model model)
	{
	
		System.out.println("Hello"+theId);
		
		Services theService=medicalService.getService(theId); 
		System.out.println(theService+"world");
		//System.out.println(theService);

		model.addAttribute("description",theService);
		
		return "servicedetailsAdminTest";
	}
	
	
	@PostMapping("/saveService")
	public String saveAService(@ModelAttribute("service") Services theService,Model model)
	{
		medicalService.saveMedicalService(theService);
		List<Services>lb=medicalService.listAllServices();
		model.addAttribute("service",lb);
		model.addAttribute("alertMsg","true");
		return "redirect:/service/listServicesDoctor";
	
	}

	@PostMapping("/saveServiceAdmin")
	public String saveAServiceAdmin(@ModelAttribute("service") Services theService,Model model)
	{
		medicalService.saveMedicalService(theService);
		List<Services>lb=medicalService.listAllServices();
		model.addAttribute("service",lb);
		model.addAttribute("alertMsg","true");
		return "redirect:/service/listServicesAdmin";
	
	}
	
	
	@GetMapping("/updateService")
	public String updateServiceForm(@RequestParam("serviceId") int theId , Model model)
	{
		Services theService=medicalService.getService(theId);
		System.out.println(theService);
		Services aa=new Services();
		//model.addAttribute("serviceUpd",aa);
		model.addAttribute("service",theService);

		return "serviceUpdateTest";  
	}
	
	@GetMapping("/updateServiceAdmin")
	public String updateServiceFormAdmin(@RequestParam("serviceId") int theId , Model model)
	{
		Services theService=medicalService.getService(theId);
		System.out.println(theService);
		Services aa=new Services();
		//model.addAttribute("serviceUpd",aa);
		model.addAttribute("service",theService);

		return "serviceUpdateAdminTest";  
	}
	
	@GetMapping("/addService")
	public String addNewService(Model model)
	{
		Services service=new Services();
		model.addAttribute("service",service);
		return "addServiceAdmin";
	}
	
	@GetMapping("/delete")
	public String deleteDoctor(@RequestParam("serviceId") int theId, Model model)
	{
		medicalService.delete(theId);
		System.out.println("In controller");
		return "redirect:/service/listServicesAdmin";    
	}
}
