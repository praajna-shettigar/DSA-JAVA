package DesignPackingLot;

class ParkingLot {
    private ParkingLevel[] levels;

    public ParkingLot(int numberOfLevels, int spotsPerLevel) {
        levels = new ParkingLevel[numberOfLevels];
        for (int i = 0; i < numberOfLevels; i++) {
            levels[i] = new ParkingLevel(i, spotsPerLevel);
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if (level.parkVehicle(vehicle)) {
                return true;  // Vehicle parked successfully
            }
        }
        return false;  // No spot found
    }

    public void leaveSpot(int level, int spotNumber) {
        levels[level].leaveSpot(spotNumber);
    }
}
