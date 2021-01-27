package com.raghu.EmployeeMgmt.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.raghu.EmployeeMgmt.DAO.EmployeeDAO;
import com.raghu.EmployeeMgmt.Entity.Employee;

@RestController
public class EmployeeController {
	
		@Autowired
		EmployeeDAO empDAO;

		@PostMapping("/addorUpdateEmployee")
		public Employee addAlien(@RequestBody Employee emp)
		{
			empDAO.save(emp);
			return emp;
		}
		
		@GetMapping("/GetAllEmployees")  
		public List<Employee>getAllBooks()   
		{  
			List<Employee> emps = new ArrayList<Employee>();  
			empDAO.findAll().forEach(emp1 -> emps.add(emp1));  
			return emps;  
		
		}  
		
		@DeleteMapping("/DeleteEmployee/{eid}")  
		private Boolean deleteBook(@PathVariable("eid") int eid)   
		{  
			empDAO.deleteById(eid);  
			
			return true;
		}  
		
		@GetMapping("/GetEmployeeById/{eid}")
		public Employee getBooksById(@PathVariable("eid") int eid)   
		{  
			return empDAO.findById(eid).get();  
		}  
		
		

}
