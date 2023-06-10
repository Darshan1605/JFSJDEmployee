package employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
