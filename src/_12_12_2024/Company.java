package _12_12_2024;

import _09_12_2024.Employee1;

import java.util.Arrays;

public class Company {

    private int id;
    private String name;
    private String address;
    private Department department;

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", department=" + department +
                '}';
    }

    public Company(String name, int id, String address, Department department) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.department = department;

    }
}

class Department {
    private int DepartamntId;
    private String name;
    private int maxEmpNum;
    private Employee1[] employees;

    @Override
    public String toString() {
        return "Department{" +
                "maxEmpNum=" + maxEmpNum +
                ", employees=" + Arrays.toString(employees) +
                ", DepartamntId=" + DepartamntId +
                ", name='" + name + '\'' +
                '}';
    }

    public Department(int departamntId, String name, int maxEmpNum, Employee1[] employees) {
        DepartamntId = departamntId;
        this.name = name;
        this.maxEmpNum = maxEmpNum;
        this.employees = employees;
    }

    public int getDepartamntId() {
        return DepartamntId;
    }

    public int getMaxEmpNum() {
        return maxEmpNum;
    }

    public String getName() {
        return name;
    }

    public Employee1[] getEmployees() {
        return employees;
    }

    public void setDepartamntId(int departamntId) {
        DepartamntId = departamntId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxEmpNum(int maxEmpNum) {
        this.maxEmpNum = maxEmpNum;
    }

    public void setEmployees(Employee1[] employees) {
        this.employees = employees;
    }

    public static class Employee {
    }
}



