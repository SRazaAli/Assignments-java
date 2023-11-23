
package com.mycompany.librarymanagementsystem;


public class Librarian{
    //attributes
    private String name;
    private int employeeId;
    //getters

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    //Constructor

    public Librarian() {
    }

    public Librarian(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    //methods
    public void worksInLibrary(Library library){
        System.out.println(this.getName()+" Works is a Librarian in "+library.getName()+" Library");
    }
}
