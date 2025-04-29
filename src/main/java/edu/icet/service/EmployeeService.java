package edu.icet.service;

import edu.icet.dto.Employee;

import java.util.List;

public interface EmployeeService {
    void addCustomer(Employee employee);

    void addEmployee(Employee employee);
    List<Employee> getAll();

    void deleteEmployee( Integer id);

    void updateEmployee(Integer id ,Employee employee);


    Employee SearchById(Integer id);

    List<Employee>searchByName(String name);

}

