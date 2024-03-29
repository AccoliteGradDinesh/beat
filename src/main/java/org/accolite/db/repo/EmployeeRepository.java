package org.accolite.db.repo;

import org.accolite.db.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    List<Employee> findAllByProjectId(long id);
    List<Employee> findAllByName(String name);
}
