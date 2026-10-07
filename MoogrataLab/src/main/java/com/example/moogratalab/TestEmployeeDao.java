/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.moogratalab;

/**
 *
 * @author USER
 */
import com.example.moogata.dao.EmployeeDao;
import com.example.moogratalab.helper.DatabaseHelper;
import com.example.moogata.model.Employee;

public class TestEmployeeDao {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDao();

            System.out.println("--- getAll(): พนักงานทุกคน ---");
            for (Employee emp : employeeDao.getAll()) {
                System.out.println(emp);
            }

            System.out.println("--- getAll(where, order): role = 2 เรียงตามชื่อ ---");
            for (Employee emp : employeeDao.getAll("employee_role = 2", "employee_name ASC")) {
                System.out.println(emp);
            }
            } finally {
            DatabaseHelper.close();
        }
    }
}
