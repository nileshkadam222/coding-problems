package com.coding.problems.others.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {
    private final String firstName;
    private final String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

public class SortListByFirstNameAndLastNameUsingComparator {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nilesh", "Patil"));
        employees.add(new Employee("Amit", "Sharma"));
        employees.add(new Employee("Ravi", "Kumar"));
        employees.add(new Employee("Amit", "Aharma"));
        employees.add(new Employee("Amit", "Verma"));
        employees.add(new Employee("Sneha", "Joshi"));

        employees.sort(((o1, o2) -> {
            int firstSort = o1.getFirstName().compareTo(o2.getFirstName());
            if(firstSort == 0){
                return o1.getLastName().compareTo(o2.getLastName());
            }
            return firstSort;
        }));

        employees.forEach(System.out::println);

        employees.sort(Comparator.comparing(Employee::getFirstName).thenComparing(Employee::getLastName).reversed());
        employees.forEach(System.out::println);

    }
}
