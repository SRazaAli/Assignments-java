package com.mycompany.mavenproject2;
public class Mavenproject2 {
    public static void main(String[] args) {
        //Task---01
                  ComputerSystem obj1 = new ComputerSystem();
                  obj1.printSpecs();
          ComputerSystem obj = new ComputerSystem();
          obj.setName("DELL");
          obj.setType("Laptop");
          obj.setProcessor("i5 12th gen");
          obj.setOpticalDrive("HP");
          obj.setRAM(16);
          obj.sethardDisk(20000);
          System.out.println("Name : "+obj.getName());
          System.out.println("Name : "+obj.getType());

          System.out.println("Name : "+obj.getProcessor());

           System.out.println("Name : "+obj.getMotherBoard());

           System.out.println("Name : "+obj.getOpticalDrive());
            System.out.println("Name : "+obj.getRAM());
            System.out.println("Name : "+obj.getHardDisk());


//        task 2
//        Values can be taken from the user and can be validated by conditioning but giving hardcoded
//        Task2 now1 = new Task2(); // default
//        now1.print(); // Whole date
//
//        Task2 now2 = new Task2(); // 3 parameterized
//        now2.print(); // Whole date
//
//        Task2 now3 = new Task2(2003, 10, 21, 11, 30, 55); // 6 parametized
//
////        Same setting can be done with year, hour, ,day, hour, minutes, seconds
//        String month = now3.getMonth(); // getting
//        System.out.println("The current month is " + month);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter a number that indicates month: "); // setting
//        int monthInput = input.nextInt();
//        now3.setMonth(monthInput);
//        month = now3.getMonth(); // getting again
//        System.out.println("Now the month is " + month);
//
//        System.out.println("And the whole date looks like:");
//        now3.print(); // Whole date

//Task---03
        Book book1 = new Book();
        System.out.println("=============== By using Getters and Setters ===============");
        book1.setTitle("Fundamentals of Physics");
        book1.setAuthor("Halliday Resnick");
        book1.setPrice(100.32);
        System.out.println("Title : "+book1.getTitle());
        System.out.println("Title : "+book1.getAuthor());
        System.out.println("Title : "+book1.getPrice());
        
        System.out.println("=============== By using Default constructor ===============");
        Book book2 = new Book();
        System.out.println(book2);
    }
}
