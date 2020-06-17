package com.it.service.impl;

import com.it.dao.EmployeeDao;
import com.it.domain.Employee;
import com.it.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public List<Employee> findAll() {
        System.out.println("查询所有");
        return employeeDao.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        System.out.println("增加一个员工");
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void delEmployee(int id) {
        employeeDao.delEmployee(id);
    }

    @Override
    public boolean findById(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public void updateEmploy(Employee employee) {
        employeeDao.updateEmploy(employee);
    }
}
