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
		/*Leaves lv = new Leaves();
		
		lv.setDescription("I am anjan");
		lv.setDuration(3);
		lv.setEmpId(1);
		
		Date dd= new Date();
		
		lv.setEndDate(dd);
		
		lv.setId(1);
		
		lv.setLeaveType("hjhj");
		
		lv.setManagerComment("manager");
		
		lv.setStartDate(dd);
		
		leaveService.save(lv);*/
		
		
		
		
	}
	
	@PostMapping(value = "/", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public void saveLeave(@ModelAttribute @Valid Leaves leave, BindingResult result) {
		System.out.println("anjan=============================================");
		System.out.println(leave.toString());
		
		
		try {
			List<Leavetypes> allLeaveType = (List<Leavetypes>) leaveTypeService.getAllLeavetype();
			System.out.println(allLeaveType);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		/*for (int i = 0; i < allLeaveType.size(); i++) {
			Leavetypes iterable_element = allLeaveType.get(i);
			System.out.println(iterable_element.getTypeName());
		}*/
	}
	
}















