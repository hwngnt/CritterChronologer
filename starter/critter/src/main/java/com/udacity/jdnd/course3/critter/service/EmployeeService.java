package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.model.Employee;
import com.udacity.jdnd.course3.critter.user.EmployeeSkill;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(long employeeId);
    List<Employee> getEmployeesForServices(LocalDate localDate, Set<EmployeeSkill> skills);
    void setEmployeeAvailability(Set<DayOfWeek> days, Long employeeId);
}
