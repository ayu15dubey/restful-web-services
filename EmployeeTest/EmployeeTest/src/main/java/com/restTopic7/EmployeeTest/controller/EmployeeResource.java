package com.restTopic7.EmployeeTest.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restTopic7.EmployeeTest.Dao.EmployeeReposiroty;
import com.restTopic7.EmployeeTest.Model.Employee;
import com.restTopic7.EmployeeTest.Service.EmployeeService;
@Component
@Path("/employee")
public class EmployeeResource {
	@Autowired
	EmployeeReposiroty employee;
	
	@Autowired
	EmployeeService service;
	
	@Path("/addemployee")
	@POST
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML})
	public Employee addEmployee(Employee employee) {
		
		return service.addUser(employee);
	}

	@Path("/getempbylocation/{location}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Employee> getempbylocation(@PathParam("location") String location){
		return service.getallemployeeByLocation(location);
	}
	
	
	@Path("/getempbyband/{band}")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Employee> getempbyband(@PathParam("band") String band){
		return service.getallemployeeByBand(band);
	}
	

	@Path("/getallemployee")
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Employee> getallemployee(){
		return service.getallemployee();
	}
	
	@Path("/updateanemployee/{id}")
	@PUT
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public ResponseBuilder updateemp(@PathParam("id") Integer id, Employee employee) throws Throwable {
		return service.updateUser(id, employee);
	}
	
}
