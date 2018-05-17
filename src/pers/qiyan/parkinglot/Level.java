package pers.qiyan.parkinglot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Level {
    private final List<ParkingSpot> spots;

    public Level(int numOfSpots){
      List<ParkingSpot> list = new ArrayList<>(numOfSpots);
      for(int i = 0; i < numOfSpots / 2; i++){
        list.add(new ParkingSpot(VehicleSize.Compact,null,i));
      }
      for(int i = numOfSpots / 2; i < numOfSpots; i++){
        list.add(new ParkingSpot(VehicleSize.Large,null,i));
      }
      spots = Collections.unmodifiableList(list);
    }

    public boolean hasSpot(Vehicle vehicle){
      for(ParkingSpot spot : spots){
        if(spot.getVehicle() == null && spot.fit(vehicle)){
              return true;
        }
      }
      return false;
    }

    public boolean park(Vehicle v){
      for(ParkingSpot spot : spots){
        if(spot.getVehicle() == null && spot.fit(v)){
          spot.park(v);
          return true;
        }
      }
      return false;
    }

    public boolean leave(Vehicle v){
      for(ParkingSpot spot : spots){
        if(spot.getVehicle() == v){
          spot.leave();
          return true;
        }
      }
      return false;
    }
 }
