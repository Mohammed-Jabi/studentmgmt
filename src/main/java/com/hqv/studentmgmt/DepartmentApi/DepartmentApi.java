package com.hqv.studentmgmt.DepartmentApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hqv.studentmgmt.entity.Department;
import com.hqv.studentmgmt.repository.DepartmentRepository;

@RestController

public class DepartmentApi {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody Department department)
	{
		departmentRepository.save(department);
		return department;
	}

}
