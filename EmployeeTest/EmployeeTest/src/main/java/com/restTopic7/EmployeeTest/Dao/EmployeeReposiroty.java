package com.restTopic7.EmployeeTest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restTopic7.EmployeeTest.Model.Employee;
@Repository
public interface EmployeeReposiroty extends JpaRepository<Employee,Integer>{

}
