package pers.qiyan.parkinglot;

public class Car extends Vehicle {
    final VehicleSize size;
    @Override
    public VehicleSize getSize(){
        return size;
    }
    public Car(){
        this.size = VehicleSize.Compact;
    }
}
