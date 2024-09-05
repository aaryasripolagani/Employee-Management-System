package com.springmvc.empcrudapp.service;
import java.util.*;
import org.springframework.data.domain.Page;
import com.springmvc.empcrudapp.model.Employee;
public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo,int pageSize,String sortField,String sortDirection);
	List<Employee> searchEmployeesByFirstName(String firstName);

	
	
}
