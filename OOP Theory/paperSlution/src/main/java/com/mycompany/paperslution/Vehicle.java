
package com.mycompany.paperslution;

public abstract class Vehicle {
    //attributes
    protected String numberPlate;
    protected double speed, width, turningRadius;
    //abstracted method
    public abstract double kilometeresPerLiter();
    public abstract double distanceToRefueling();
    public abstract String toString();

    //constructors

    public Vehicle() {
    }

    public Vehicle(String numberPlate,  double width, double turningRadius) {
        this.numberPlate = numberPlate;
        this.speed = speed;
        this.width = width;
        this.turningRadius = turningRadius;
    }
    //methods
    public boolean isUturnPossible(double roadWidth){
        if(roadWidth> (this.width+2*turningRadius))
            return true;
        else
            return false;
    }
    //setter
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
}
