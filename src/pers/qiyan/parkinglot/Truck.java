package pers.qiyan.parkinglot;

public class Truck extends Vehicle {
    final VehicleSize size;
    @Override
    public VehicleSize getSize(){
        return size;
    }
    public Truck(){
        this.size = VehicleSize.Large;
    }
}
