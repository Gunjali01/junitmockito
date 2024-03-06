package com.csi.repo;

import com.csi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);

    List<Employee> findByEmpName(String empName);
}
