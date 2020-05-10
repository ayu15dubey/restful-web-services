package com.restTopic7.EmployeeTest.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="first_name",nullable=false)
	private String firstName;
	
	@Column(name="last_name",nullable=false)
	private String lastName;
	
	@Column(name="empLocation",nullable=false)
	private String empLocation;
	
	@Column(name="empBand",nullable=false)
	private String empBand;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public String getEmpBand() {
		return empBand;
	}

	public void setEmpBand(String empBand) {
		this.empBand = empBand;
	}

	public Employee(Integer id, String firstName, String lastName, String empLocation, String empBand) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empLocation = empLocation;
		this.empBand = empBand;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
