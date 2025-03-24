package DesignPackingLot;

class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int spotNumber;
    private int levelNumber;

    public ParkingSpot(VehicleSize size, int number, int level) {
        this.spotSize = size;
        this.spotNumber = number;
        this.levelNumber = level;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.canFitInSpot(this);
    }

    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void leave() {
        this.vehicle = null;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }
}
