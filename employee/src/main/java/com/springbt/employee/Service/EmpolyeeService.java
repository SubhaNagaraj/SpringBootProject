package com.springbt.employee.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbt.employee.Model.EmployeeModel;
import com.springbt.employee.Repository.EmployeeRepository;

@Service
public class EmpolyeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeeModel> findAllrecords() {
		return employeeRepository.findAll();
	}

	public EmployeeModel insertRecords(EmployeeModel employeeModel) {
		return employeeRepository.save(employeeModel);
	}

	public Optional<EmployeeModel> findRecords(Integer id) {
		return employeeRepository.findById(id);
	}

	public List<EmployeeModel> deleteRecords(Integer id) {
		employeeRepository.deleteById(id);
		return employeeRepository.findAll();
	}

	/*
	 * public EmployeeModel updateRecords(Integer id, String name) {
	 * Optional<EmployeeModel> empsave = employeeRepository.findById(id);
	 * empsave.get().setName(name); // return
	 * employeeRepository.save(empsave.get()); }
	 */

}
