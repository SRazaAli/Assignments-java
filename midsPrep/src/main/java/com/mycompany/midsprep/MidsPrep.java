
package com.mycompany.midsprep;

import java.util.ArrayList;
import java.util.Scanner;

class Employee{
    private String Name,qualification;
    private int Id;
    
    //getters

    public String getName() {
        return Name;
    }

    public String getQualification() {
        return qualification;
    }

    public int getId() {
        return Id;
    }
    //setters

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    //constructor

    public Employee() {
    }

    public Employee(String Name, String qualification, int Id) {
        this.Name = Name;
        this.qualification = qualification;
        this.Id = Id;
    }
    //methods
    public void displayInfo(){
        System.out.println("Name : "+Name+"\n Qualification : "+qualification+"ID : "+Id);
    }
    public void getData(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = input.nextLine();
        System.out.println("Enter your qualification : ");
        String qualification = input.nextLine();
        System.out.println("Enter your ID : ");
        int id = input.nextInt();
        setName(name);
        setQualification(qualification);
        setId(id);
    }
    
}
class MonthlySalEmployee extends Employee{
    private double basicPay,allowances;
    Scanner sc = new Scanner(System.in);
    //getters
    public double getBasicPay(){
        return basicPay;
    }
    public double getAllownaces(){
        return allowances;
    }
    //setters
    public void setBasicPay(double basicPay){
        this.basicPay = basicPay;
    }
    public void setAllowances(double allowances){
        this.allowances  =allowances;
    }
    //methods
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Basic Pay : "+basicPay+"\n Allowances : "+allowances);
    }
    public void getData(){
        super.getData();
        System.out.println("Enter your Basic pay : ");
        int basicPay = sc.nextInt();
        System.out.println("");
        System.out.println("Enter your Allowances : ");
        int allowances = sc.nextInt();
        setBasicPay(basicPay);
        setAllowances(allowances);
    }
    public void searchEmployee(ArrayList<MonthlySalEmployee> monthEmployees){
        System.out.println("Enter name : ");
        boolean flag= false;
        String searchEmpName = sc.nextLine();
           for(int i = 0;i<monthEmployees.size();i++){
               if(searchEmpName == monthEmployees.get(i).getName()){
                   flag = true;
               }
           }
           if(flag){
               System.out.println("User Found!");
           }
           else if(!flag){
               System.out.println("User doesn't exist :(");
           }
    }
    //constructor
    MonthlySalEmployee(){
        
    }
    MonthlySalEmployee(double basicPay,double allowances){
        this.basicPay  = basicPay;
        this.allowances = allowances;
    }
    
}
class Company{
    MonthlySalEmployee obj;
    private ArrayList<MonthlySalEmployee> monthEmployees = new ArrayList<MonthlySalEmployee>();
    
   
    public void addMonthlyEmployee(MonthlySalEmployee obj){
        obj.getData();
        monthEmployees.add(obj);
    }
    public void displayEmpList(){
        for(int i = 0; i<monthEmployees.size();i++){
            System.out.println("============ Employee "+(i+1)+" ============");
            monthEmployees.get(i).displayInfo();
        }
    }
    

}
public class MidsPrep {

    public static void main(String[] args) {
        
    }
}
