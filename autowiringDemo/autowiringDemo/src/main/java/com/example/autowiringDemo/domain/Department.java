package com.example.autowiringDemo.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Department {
    private int id;
    private String name;
    @Autowired
    private Employee employee;

    // Constructor
    public Department(int id, String name) {
        this.id = id;
        this.name = name;

    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employee=" + employee +
                '}';
    }
}


