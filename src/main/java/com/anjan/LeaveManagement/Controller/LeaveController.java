package com.anjan.LeaveManagement.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.hibernate.engine.transaction.jta.platform.internal.SynchronizationRegistryBasedSynchronizationStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.anjan.LeaveManagement.model.Leaves;
import com.anjan.LeaveManagement.model.Leavetypes;
import com.anjan.LeaveManagement.repository.LeaveRepository;
import com.anjan.LeaveManagement.service.LeaveService;
import com.anjan.LeaveManagement.service.LeaveTypeService;




@RestController
public class LeaveController {
	
	@Autowired
	LeaveService leaveService;
	LeaveTypeService leaveTypeService;
	
	@GetMapping("/")
	public ModelAndView ShowAllLeave(Model model) {
		return new ModelAndView("ShowAllLeave");
	}
	
	@GetMapping(value="/show", produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Leaves> getAllLeave(@RequestParam Integer page) {
		System.out.println("page=================="+page);
		
		return (List<Leaves>) leaveService.getPage(page);
	}
	
	
	@GetMapping("/createLeave")
	public ModelAndView createLeave(Model model) {
		return new ModelAndView("createLeave");
	}
	
	@GetMapping("/editLeave")
	public ModelAndView editLeave(Model model) {
		return new ModelAndView("editLeave");
	}
	@GetMapping("/leaveDetails")
	public ModelAndView leaveDetails(Model model) {
		return new ModelAndView("leaveDetails");
	}
	
	
	@GetMapping("/test")
	public void leaveCreate(){
		
		
		
		
	}
	
	@PostMapping(value = "/saveLeave", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public String saveLeave(@ModelAttribute @Valid Leaves leave, BindingResult result) {
		System.out.println("anjan=============================================");
		System.out.println(leave.toString());
		
		leave.setDuration(1);
		leave.setEmpId(1);

		leaveService.save(leave);
		
		
		return "";
		
		
	}
	
}















