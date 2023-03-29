package com.example.autowiringDemo;

import com.example.autowiringDemo.config.MyAppConfig;
import com.example.autowiringDemo.domain.Department;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowiringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowiringDemoApplication.class, args);
		System.out.println("Hello World!");
		// Create a Spring application context
		ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);

		// Get the Department object from the application context
		Department department = context.getBean("employee1", Department.class);

		// Access the Department's Employee instance
//        Employee departmentEmployee = department.getEmployee();

		// Print the Department's name and the name and salary of its Employee
		System.out.println("Department: " + department);
//        System.out.println("Employee: " + departmentEmployee);

	}

}
