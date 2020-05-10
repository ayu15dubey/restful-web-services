package com.restTopic7.EmployeeTest.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.restTopic7.EmployeeTest.controller.EmployeeResource;

@Component
@ApplicationPath("/boot-jersey")
public class JerseyCongig extends ResourceConfig{
	 public JerseyCongig() {
		  register(EmployeeResource.class);
}
}
