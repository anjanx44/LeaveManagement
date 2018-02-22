package com.anjan.LeaveManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.anjan.LeaveManagement.model.Leaves;
import com.anjan.LeaveManagement.service.LeaveService;


@RestController
public class LeaveController {
	
	@Autowired
	LeaveService leaveService;
	
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
	
	
	
	@GetMapping(value = "/showLeave", produces = { MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<Leaves> showEmployee() {
		System.out.println("Anjanssssssssssssssssssssssss");
		List <Leaves> list = new ArrayList<Leaves>();
		list = (List<Leaves>) leaveService.findAllEmployees();
		
		return list;
	}
}
