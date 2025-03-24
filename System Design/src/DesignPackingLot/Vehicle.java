package DesignPackingLot;

abstract class Vehicle {
    protected VehicleSize size; 
    protected String licensePlate;

    public VehicleSize getSize() {
        return size;
    }

    // This method checks if the vehicle can fit in a spot
    public abstract boolean canFitInSpot(ParkingSpot spot);
}