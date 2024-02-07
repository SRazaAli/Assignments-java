//
//package com.mycompany.paperslution;
//
//public class Motorcycle extends Vehicle implements CommercialVehicle{
//    private double engineVolume;
//    
//    //constructor
//
//    public Motorcycle() {
//    }
//    public Motorcycle(double engineVolume, String numberPlate,double width,double turningRadius){
//        super(numberPlate,width,turningRadius);
//        this.engineVolume = engineVolume;
//    }
//    //overriden methods
//    @Override
//    public void setSpeed(double speed){
//        super.speed = speed;
//    }
//
//    @Override
//    public double kilometeresPerLiter() {
//        return 1.0/(0.0000008*speed*speed+0.0002*speed+0.02);
//    }
//    @Override
//    public double distanceToRefueling(){
//        return kilometeresPerLiter()*this.engineVolume;
//    }
//
//    @Override
//    public double calculatedTax() {
//        return  120*this.engineVolume;
//    }
//
//    @Override
//    public double calculatedAmortizedTax() {
//        try{
//            return result;
//        }
//        catch(UnsupportedOperationException e){
//            System.out.println("Not supported Yet...");
//        }
//
//    }
//    
//    
//    
//    @Override
//   public String toString(){
//       return numberPlate+" "+width+" "+turningRadius+" "+engineVolume+" "+speed+" "+kilometeresPerLiter()+" "+distanceToRefueling();
//   } 
//   
//}
