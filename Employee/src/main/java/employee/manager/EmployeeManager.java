package employee.manager;

import java.util.List;

import employee.entity.Employee;
import employee.repository.EmployeeRepository;

public interface EmployeeManager{
	List<Employee> getAll();
	Employee addEmployee(Employee employee);
	
}

