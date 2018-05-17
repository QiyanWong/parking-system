package pers.qiyan.parkinglot;

public enum VehicleSize {
    Large(1),
    Compact(0);

    private final int size;
    VehicleSize(int i) {
        size = i;
    }

    public int size(){
        return size;
    }
}
