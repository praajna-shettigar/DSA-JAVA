package DesignPackingLot;

class Car extends Vehicle {
    public Car() {
        size = VehicleSize.COMPACT;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSpotSize() == VehicleSize.COMPACT || 
               spot.getSpotSize() == VehicleSize.LARGE;
    }
}