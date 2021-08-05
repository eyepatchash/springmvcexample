package com.howtodoinjava.demo.controller;

import com.howtodoinjava.demo.dao.EmployeeDAO;
import com.howtodoinjava.demo.dao.EmployeeDAOImpl;
import com.howtodoinjava.demo.model.EmployeeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.service.EmployeeManager;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeManager manager;

	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";

	}
//	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
//	@ResponseBody
//	public List<EmployeeVO> getAll()
//	{
////		model.addAttribute("employees", manager.getAllEmployees());
//
//		return manager.getAllEmployees();
//
//	}
}