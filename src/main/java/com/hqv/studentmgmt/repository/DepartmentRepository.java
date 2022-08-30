package com.hqv.studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hqv.studentmgmt.entity.Department;

public interface DepartmentRepository 
 extends JpaRepository<Department, Long>{

}
