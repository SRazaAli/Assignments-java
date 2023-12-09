
package com.mycompany.interfacesapplication;


abstract class Person{
    //data members
    protected String firstName;
    protected String lastName;
    protected int age;
    //Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //method
    abstract void display();  
}
class Student extends Person{
    private char grade;
    //getter

    public char getGrade() {
        return grade;
    }
    //setter 

    public void setGrade(char grade) {
        this.grade = grade;
    }
    //constructor

    public Student(String firstName, String lastName, int age, char grade) {
       super(firstName,lastName,age);
        this.grade = grade;
    }
    //method
    @Override
    void display() {
        System.out.println("======== Student Info ======== \nFirst Name : "+firstName+"\n"+"Last Name : "+lastName+"\n"+"Age : "+age
        +"\nGrade : "+grade);
    }
    
   
}
class Staff extends Person implements Payable{
    private double salary;
    //constructor
    public Staff(double salary, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.salary = salary;
    }
    //method
    @Override
    void display() {
        System.out.println("======== Staff Info ======== \nFirst Name : "+firstName+"\n"+"Last Name : "+lastName+"\n"+"Age : "+age
        +"\nSalary : "+salary); 
    } 
    public double getPayment(){
        return this.salary;
    }
}
interface Payable{
    double getPayment();
} 
public class InterfacesApplication {

    public static void main(String[] args) {
       //three objs of Student
        Student student1 = new Student("Raza","Ali",19,'A');
        Student student2 = new Student("Muskan","Khan",19,'B');
        Student student3 = new Student("Aimen","Abdullah",20,'C');
        //three objs of Staff
        Staff member1 = new Staff(20000,"Ali","Ahmed",25);
        Staff member2 = new Staff(30000,"Ahmed","Raza",23);
        Staff member3 = new Staff(17000,"Rameel","Ahmmed",26);
        //printing the details of Students
        student1.display();
        student2.display();
        student3.display();
        //printing the details of Staff
        member1.display();
        member2.display();
        member3.display();
    }
}
