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
import com.cts.entity.Doctor;
import com.cts.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;    
	
	@GetMapping("/doctorListAdmin")
	public String doctorList(Model model) {
			
		List<Doctor> list = doctorService.doctorList();
		model.addAttribute("doctor",list);
			return "listAllDoctorsTest";
		} 
	
	
	@PostMapping("/save")
	public String saveDoctorDetailsThroughAdmin(@ModelAttribute("doctor") Doctor theDoctor)
	{
		System.out.println(theDoctor);
		doctorService.saveDoctor(theDoctor);
		return "redirect:/doctor/doctorListAdmin";
	}
	
	
	@GetMapping("/update")
	public String showDoctorUpdateForm(@RequestParam("serviceId") int theId, Model model)
	{

	    Doctor theDoctor=doctorService.getDoctorById(theId);
	  
	    model.addAttribute("doctor",theDoctor);
		return "adminUpdateDoctorTest";
	}
	
	@GetMapping("/delete")
	public String deleteDoctor(@RequestParam("serviceId") int theId, Model model)
	{
		doctorService.deleteDoctor(theId);
		System.out.println("In controller");
		return "redirect:/doctor/doctorListAdmin";
	}
	
	
	@PostMapping("/saveDoctor")
	public String saveDoctorDetails(@ModelAttribute("doctor") Doctor theDoctor)
	{
		System.out.println(theDoctor);
		doctorService.saveDoctor(theDoctor);
		return "redirect:/doctor/doctorhome";
	}
	

	@GetMapping("/updateDoctor")
	public String showDoctorUpdateForm(Principal p, Model model)
	{
		String username= p.getName();
		
//		System.out.println("ye rahi ID :"+theId);
	    Doctor theDoctor=doctorService.getDoctor(username);
		model.addAttribute("doctor",theDoctor);
		return "doctorUpdateTest";
	}
	

	@GetMapping("/doctorhome")
	public String showDoctor(Principal principal , Model model)
	{
		String username = principal.getName();
		System.out.println(username+"in doctor home");
		Doctor theDoctor=doctorService.getDoctor(username);
		List request = doctorService.getTotalRequests(username);
		String s = String.valueOf(request.get(1));
		//int i = Integer.parseInt(s);
		model.addAttribute("requests",request.get(0));
		model.addAttribute("reports",s);
		model.addAttribute("appointments",request.get(2));
		model.addAttribute("services",request.get(3));
		model.addAttribute("doctor",theDoctor);
		model.addAttribute("username",username);
		return "test";
	}

	@GetMapping("/viewDoctorRequests")
	public String viewDoctorRequests(Principal principal,Model theModel)
	{
		/*Doctor  doctor =doctorService.getDoctorRequests(Id);*/
		String username = principal.getName();
		List<CheckupRequest> list =doctorService.getRequest(username);
		System.out.println(list);
		theModel.addAttribute("requestlist",list);
		
		return "doctorRequestTest"; 
	}
	@GetMapping("/view")
	public String showDoctorToAdmin(@RequestParam("serviceId") int theId , Model model)
	{
		Doctor theDoctor=doctorService.getDoctorById(theId);
		model.addAttribute("doctor",theDoctor);
		return "viewDoctorToAdminTest";
	}

	@GetMapping("/viewAcceptedRequests")
	public String viewAcceptedRequests(Model theModel,Principal principal)
	{
		String username = principal.getName();
		Doctor theDoctor=doctorService.getDoctor(username);
		int id= theDoctor.getId();
		List<CheckupRequest> results = doctorService.getAcceptedRequests(id);
		theModel.addAttribute("requests",results);
		
		
		return "acceptedRequestsTest";
	
	}
	
	
	@GetMapping("/viewReports")
	public String viewReports(Model theModel,Principal principal)
	{
		String username = principal.getName();
		Doctor theDoctor=doctorService.getDoctor(username);
		int id= theDoctor.getId();
		List<CheckupRequest> results = doctorService.getReports(id);
		System.out.println(results+"reports~~~~~");
		theModel.addAttribute("requests",results);
	 
		return "doctorReportsTest";
	
	}
	
	
}
