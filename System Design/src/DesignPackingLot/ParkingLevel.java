package DesignPackingLot;

class ParkingLevel {
    private int levelNumber;
    private ParkingSpot[] spots;
    private int availableSpots = 0;  // number of free spots on this level

    public ParkingLevel(int levelNumber, int numSpots) {
        this.levelNumber = levelNumber;
        spots = new ParkingSpot[numSpots];

        // Create spots: say first half is for motorcycles, second half for cars
        for (int i = 0; i < numSpots / 2; i++) {
            spots[i] = new ParkingSpot(VehicleSize.MOTORCYCLE, i, levelNumber);
        }
        for (int i = numSpots / 2; i < numSpots; i++) {
            spots[i] = new ParkingSpot(VehicleSize.COMPACT, i, levelNumber);
        }

        availableSpots = numSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canFitVehicle(vehicle) && spot.isAvailable()) {
                spot.park(vehicle);
                availableSpots--;
                return true;
            }
        }
        return false;  // No spot found
    }

    public void leaveSpot(int spotNumber) {
        spots[spotNumber].leave();
        availableSpots++;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }
}
