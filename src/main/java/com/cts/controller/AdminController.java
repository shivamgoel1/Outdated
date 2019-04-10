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

import com.cts.entity.Admin;
import com.cts.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@GetMapping("/adminhome")
	public String adminList(Model model,Principal p) {
		String username = p.getName();
			Admin admin= adminService.getAdmin(username);
			List request = adminService.getTotalRequests(username);
			model.addAttribute("doctors",request.get(2));
			model.addAttribute("customers",request.get(0));
			model.addAttribute("services",request.get(1));
			model.addAttribute("admin",admin);
			System.out.println(admin+"sdfsdgf72342895"); 
			return "adminHomeTest";
		}
	
	@GetMapping("/updateAdmin")
	public String showDoctorUpdateForm(Principal p, Model model)
	{
		String username= p.getName();
		
//		System.out.println("ye rahi ID :"+theId);
	    Admin admin=adminService.getAdmin(username);
		model.addAttribute("admin",admin);
		return "adminUpdateTest";
	}
	
	@PostMapping("/saveAdmin")
	public String saveDoctorDetails(@ModelAttribute("admin") Admin admin)
	{
		System.out.println(admin);
		adminService.registerUser(admin);
		return "redirect:/admin/adminhome";
	}
	
	
	
}
