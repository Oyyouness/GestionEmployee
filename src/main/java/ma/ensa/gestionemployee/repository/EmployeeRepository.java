package ma.ensa.gestionemployee.repository;

import ma.ensa.gestionemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
