/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.moogata.service;

/**
 *
 * @author USER
 */

import com.example.moogata.dao.EmployeeDao;
import com.example.moogata.model.Employee;

public class EmployeeService {
    private final EmployeeDao employeeDao = new EmployeeDao();
    public Employee login(String name, String password) {
        Employee employee = employeeDao.getByName(name);
        if (employee != null && employee.getPassword().equals(password)) {
            return employee;
        }
        return null;
    }
}
