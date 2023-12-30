/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lenovo
 */
class Employee {
    private String name;
    private String department;
    private String contact;
    private String designation;
    private String salary;
    private String status;
    //constructor
    public Employee(String name, String department, String contact, String designation, String salary, String status) {
        this.name = name;
        this.department = department;
        this.contact = contact;
        this.designation = designation;
        this.salary = salary;
        this.status = status;
    }
    //getters

    public String getContact() {
        return contact;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }
    //setters

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }
            
    //toString method
    public String toString() {
        return name + "," + department + "," + contact + "," + designation + "," + salary + "," + status;
    }
}
