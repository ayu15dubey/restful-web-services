package com.restTopic7.EmployeeTest.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restTopic7.EmployeeTest.Dao.EmployeeReposiroty;
import com.restTopic7.EmployeeTest.Model.Employee;;
@Service
public class EmployeeService {
	@Autowired
	EmployeeReposiroty repository;

	public List<Employee> getallemployee() {
		return repository.findAll();
	}

	public List<Employee> getallemployeeByLocation(String location) {
		List<Employee> emplocation = new ArrayList<Employee>();
		List<Employee> records = new ArrayList<Employee>();

		repository.findAll().forEach(records::add);

		for (Employee e : records) {
			if (e.getEmpLocation().equalsIgnoreCase(location)) {
				emplocation.add(e);
			}
		}

		return emplocation;

	}

	public List<Employee> getallemployeeByBand(String band) {
		List<Employee> empband = new ArrayList<Employee>();
		List<Employee> records = new ArrayList<Employee>();

		repository.findAll().forEach(records::add);

		for (Employee e : records) {
			if (e.getEmpBand().equalsIgnoreCase(band)) {
				empband.add(e);
			}
		}

		return empband;

	}

	public Optional<Employee> getOneUser(Integer id) {
		return repository.findById(id);
	}

	public Employee addUser(Employee employee) {
		return repository.save(employee);

	}

	public ResponseBuilder updateUser(Integer id, Employee employeedetails) throws Throwable {

		Employee details = repository.findById(id).orElseThrow(null);

		details.setFirstName(employeedetails.getFirstName());
		details.setEmpBand(details.getEmpBand());
		details.setEmpLocation(employeedetails.getEmpLocation());

		final Employee updateDetails = repository.save(details);

		return Response.ok(updateDetails);

	}
}
