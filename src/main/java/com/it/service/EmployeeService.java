package com.it.service;

import com.it.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public void saveEmployee(Employee employee);

    public void delEmployee(int id);

    public boolean findById(int id);

    public void updateEmploy(Employee employee);
}
