package com.raghu.EmployeeMgmt.DAO;

import org.springframework.data.repository.CrudRepository;

import com.raghu.EmployeeMgmt.Entity.Employee;

public interface EmployeeDAO extends CrudRepository<Employee,Integer> {

	
}
