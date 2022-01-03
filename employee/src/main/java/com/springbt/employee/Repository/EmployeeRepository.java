package com.springbt.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbt.employee.Model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

//List<EmployeeModel> modify();

}
