package org.kedar.revision.Feb19;

import org.kedar.extras.Employee;

import java.util.List;

public class SimpleMethods {
    public static void main(String[] args) {
        List<Employee> employees = Employee.listOfEmployees;

        employees.stream().filter(emp -> emp.getAge() < 25).forEach(System.out::println);
    }
}
