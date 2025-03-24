package DesignPackingLot;

class Motorcycle extends Vehicle {
    public Motorcycle() {
        size = VehicleSize.MOTORCYCLE;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSpotSize() == VehicleSize.MOTORCYCLE || 
               spot.getSpotSize() == VehicleSize.COMPACT || 
               spot.getSpotSize() == VehicleSize.LARGE;
    }
}