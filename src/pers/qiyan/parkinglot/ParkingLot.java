package pers.qiyan.parkinglot;

public class ParkingLot {
    final Level[] levels;
  public ParkingLot(int levels, int spotsPerLevel){
      this.levels = new Level[levels];
      for(int i = 0; i < levels; i++){
          this.levels[i] = new Level(spotsPerLevel);
        }
  }
  public boolean hasSpot(Vehicle v){
      for(Level level : levels){
          if(level.hasSpot(v)){
               return true;
           }
      }
      return false;
  }

  public boolean park(Vehicle v){
    for(Level level : levels){
      if(level.park(v)){
        return true;
      }
    }
    return false;
  }

  public boolean leave(Vehicle v){
    for(Level level : levels){
      if(level.leave(v)){
        return true;
      }
    }
    return false;
  }
}
