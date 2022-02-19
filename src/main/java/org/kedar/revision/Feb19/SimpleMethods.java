package org.kedar.revision.Feb19;

import org.kedar.extras.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleMethods {
    public static void main(String[] args) {
        List<Employee> employees = Employee.listOfEmployees;

        List<Double> ages = employees.stream().mapToDouble(emp -> emp.getAge())
                .mapToObj(Double::valueOf).collect(Collectors.toList());

        System.out.println(ages);
    }
}
