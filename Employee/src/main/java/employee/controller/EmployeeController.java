package employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import employee.entity.Employee;
import employee.manager.EmployeeManager;
import jakarta.persistence.EntityManager;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeManager employeeManager;
	
	@GetMapping("/show")
	public List<Employee> showAll(){
		return employeeManager.getAll();
	}
	@PostMapping("/add")
	public Employee add(@RequestBody Employee employee) {
		employeeManager.addEmployee(employee);
		System.out.println("Employee added");
		return employee;
	}
	
}
