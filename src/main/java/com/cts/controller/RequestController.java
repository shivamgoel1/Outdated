package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.entity.CheckupRequest;
import com.cts.service.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {
	
	@Autowired
	RequestService requestService;
	
	@GetMapping("/acceptRequest")
	public String acceptRequest(@RequestParam("id") int Id,Model theModel)
	{
		CheckupRequest theRequest=requestService.getRequest(Id);
		theRequest.setStatus("Accepted");
		requestService.saveRequest(theRequest);
		System.out.println("Error in displaying JSP");
		return "redirect:/doctor/viewDoctorRequests";
	}
	
	@GetMapping("/declineRequest")
	public String deniedRequest(@RequestParam("id") int Id,Model theModel)
	{
		CheckupRequest theRequest=requestService.getRequest(Id);
		theRequest.setStatus("Denied");
		requestService.saveRequest(theRequest);
		return "redirect:/doctor/viewDoctorRequests";
	}

	
	@GetMapping("/updateResult")
	public String showDoctorUpdateForm(@RequestParam("id") int Id , Model model)
	{
		
	    CheckupRequest theResult=requestService.getRequest(Id);
		model.addAttribute("result",theResult);
		return "testResultUpdate";
	}
	
	@PostMapping("/saveResult")
	public String saveTestResults(@ModelAttribute("result") CheckupRequest theResult)
	{
		System.out.println(theResult+"pehle~~~~~~~~~~");
		theResult.setStatus("Finished");
		System.out.println(theResult+"badme~~~~~~~~~~");
		requestService.saveRequest(theResult);
		return "redirect:/doctor/viewReports";
	}

	
//	@GetMapping("/view")
//	public String view(@RequestParam("id") int Id,Model model){
//		
//		System.out.println(Id);
//		CheckupRequest request = requestService.getRequest(Id);
//		System.out.println(request.toString());
//		model.addAttribute("request",request);
//		return "viewreport";
//		
//	}
//	
	}
	
	

