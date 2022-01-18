package com.springbt.employee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbt.employee.Model.EmployeeModel;
import com.springbt.employee.Service.EmpolyeeService;

@RestController
@RequestMapping("/main")
public class EmployeeController {

	@Autowired
	private EmpolyeeService empolyeeService;

	@GetMapping("/all")
	public List<EmployeeModel> all() {
		return empolyeeService.findAllrecords();
	}

	@PostMapping("/insert")
	public EmployeeModel insertRecords(@RequestBody EmployeeModel employeeModel) {
		return empolyeeService.insertRecords(employeeModel);
	}

	@GetMapping("/find/{id}")
	public Optional<EmployeeModel> findbyid(@PathVariable Integer id) {
		return empolyeeService.findRecords(id);
		
	}

	@DeleteMapping("/dlt/{id}")
	public List<EmployeeModel> deletebyid(@PathVariable Integer id) {
		return empolyeeService.deleteRecords(id);
	}
	/*
	 * @PutMapping("/update/{id}") public List<EmployeeModel>
	 * updatebyid(@PathVariable Integer id,@RequestBody String Name) { EmployeeModel
	 * empsave=empolyeeService.findById(id); empolyeeService.getById(id); return
	 * empolyeeService.modify(); } /*
	 * 
	 * @PutMapping("/ud/{id}") public EmployeeModel (@PathVariable Integer
	 * id,@RequestBody EmployeeModel employeeModel) { return
	 * empolyeeService.save(id)
	 * 
	 * }
	 * 
	 * @GetMapping("/update/{id}") /* public Optional<EmployeeModel>
	 * updateRecords(@PathVariable Integer id,String name) { ptional<EmployeeModel>
	 * empmodel=empolyeeService.findById(id);
	 * 
	 * System.out.println(empmodel); return empmodel; }
	 */

}
