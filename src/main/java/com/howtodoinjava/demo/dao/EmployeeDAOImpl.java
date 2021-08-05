package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	List <EmployeeVO> emplist ;

	public void setEmplist(List<EmployeeVO> emplist) {
		this.emplist = emplist;
	}

	public List<EmployeeVO> getAllEmployees()
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Eyepatch");
		vo1.setLastName("ASh");
		employees.add(vo1);
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Sandeep");
		vo2.setLastName("Gozmith");
		employees.add(vo2);
		
		return employees;
	}
}