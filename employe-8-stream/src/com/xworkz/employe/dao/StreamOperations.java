package com.xworkz.employe.dao;

import com.xworkz.employe.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {

    // 1. Fetch employee's second highest salary
    public static Optional<Double> getSecondHighestSalary(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    // 2. Fetch all employees with salary greater than 25000
    public static List<Employee> getEmployeesWithHighSalary(List<Employee> employees, double threshold) {
        return employees.stream()
                .filter(e -> e.getSalary() > threshold)
                .collect(Collectors.toList());
    }

    // 3. Fetch only employees whose name starts with 'B'
    public static List<Employee> getEmployeesWithNameStartingWithB(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getName().startsWith("B"))
                .collect(Collectors.toList());
    }

    // 4. Find duplicate employee names
    public static Set<String> findDuplicateEmployeeNames(List<Employee> employees) {
        Set<String> uniqueNames = new HashSet<>();
        return employees.stream()
                .map(Employee::getName)
                .filter(name -> !uniqueNames.add(name))
                .collect(Collectors.toSet());
    }
}