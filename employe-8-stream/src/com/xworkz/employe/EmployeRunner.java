package com.xworkz.employe;

import com.xworkz.employe.dao.StreamOperations;
import com.xworkz.employe.dto.Employee;

import java.util.*;

public class EmployeRunner {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30000),
                new Employee("Bob", 40000),
                new Employee("Charlie", 20000),
                new Employee("Bob", 50000),
                new Employee("David", 25000),
                new Employee("Eve", 30000),
                new Employee("Frank", 35000),
                new Employee("Grace", 27000),
                new Employee("Bob", 30000),
                new Employee("Hank", 50000),
                new Employee("Ivy", 22000)
        );


        // 1. Fetch employee's second highest salary
        Optional<Double> secondHighestSalary = StreamOperations.getSecondHighestSalary(employees);
        secondHighestSalary.ifPresent(salary ->
                System.out.println("Second highest salary: " + salary));

        // 2. Fetch all employees with salary greater than 25000
        List<Employee> highSalaryEmployees = StreamOperations.getEmployeesWithHighSalary(employees, 25000);
        System.out.println("Employees with salary greater than 25000: " + highSalaryEmployees);

        // 3. Fetch only employees whose name starts with 'B'
        List<Employee> nameStartsWithB = StreamOperations.getEmployeesWithNameStartingWithB(employees);
        System.out.println("Employees with name starting with B: " + nameStartsWithB);

        // 4. Find duplicate employee names
        Set<String> duplicateNames = StreamOperations.findDuplicateEmployeeNames(employees);
        System.out.println("Duplicate employee names: " + duplicateNames);

    }
    }

