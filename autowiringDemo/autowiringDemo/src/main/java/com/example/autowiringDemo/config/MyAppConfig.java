package com.example.autowiringDemo.config;



import com.example.autowiringDemo.domain.Department;
import com.example.autowiringDemo.domain.Employee;
import org.springframework.context.annotation.Bean;

public class MyAppConfig {

    @Bean
    public Employee employee() {
        return new Employee(1, "John Doe", 50000.0);
    }

    @Bean("employee1")
    public Department department() {
        return new Department(1, "Sales");
    }
}

