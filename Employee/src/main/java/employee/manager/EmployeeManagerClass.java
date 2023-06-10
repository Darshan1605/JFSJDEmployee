package employee.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import employee.entity.Employee;
import employee.repository.EmployeeRepository;

public class EmployeeManagerClass implements EmployeeManager {
	@Autowired
	EmployeeRepository employeeRepositroy;
	
	@Override
	public List<Employee> getAll(){
		return employeeRepositroy.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepositroy.save(employee);
	}
}
