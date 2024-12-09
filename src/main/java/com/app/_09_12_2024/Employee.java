package com.app._09_12_2024;

public class Employee {
    int id;
    String name;
    String department;
    double salary;

    public String convertSalaryToString(double salary) {
        return "{ " + salary + " }";
    }
}