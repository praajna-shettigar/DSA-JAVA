package DesignPackingLot;

class Bus extends Vehicle {
    public Bus() {
        size = VehicleSize.LARGE;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSpotSize() == VehicleSize.LARGE;
    }
}