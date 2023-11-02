
package com.mycompany.mavenproject2;

public class ComputerSystem {
    private String name,type,processor,motherBoard,opticalDrive;
    private int ram,hardDisk;
    
    //setters
    public void setName(String name){
        this.name = name;
    }
     public void setType(String type){
        this.type = type;
    }
      public void setProcessor(String processor){
        this.processor = processor;
    }
       public void setMotherBoard(String motherBoard){
        this.motherBoard = motherBoard;
    }
        public void setOpticalDrive(String opticalDrive){
        this.opticalDrive = opticalDrive;
    }
         public void setRAM(int ram){
        this.ram = ram;
    }
          public void sethardDisk(int hardDisk){
        this.hardDisk = hardDisk;
    }
          
    //getters
    public String getName(){
        return name;
    }
     public String getType(){
        return type;
    }
      public String getProcessor(){
        return processor;
    }
       public String getMotherBoard(){
        return motherBoard;
    }
        public String getOpticalDrive(){
        return opticalDrive;
    }
         public int getRAM(){
        return ram;
    }
          public int getHardDisk(){
        return hardDisk;
    }
          
     //constructor
      ComputerSystem(){
          name = "Lenovo";
          type = "Desktop";
          processor = "i7 4th gen";
          motherBoard = "MSI";
          opticalDrive = "GigaByte";
          ram = 12;
          hardDisk = 1000;
      }  
      //printAll
      void printSpecs(){
          System.out.println("Name : "+name);
          System.out.println("Type : "+type);
          System.out.println("Processor : "+processor);
          System.out.println("Motherboard : "+motherBoard);
          System.out.println("OpticalDrive : "+opticalDrive);
          System.out.println("RAM : "+ram+" GB");
          System.out.println("Hard drive : "+hardDisk+" GB");
      }
    
}
