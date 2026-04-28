package com.logisticsroutetracker;

class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "FuelCheckpoint";
    }

    double calculatePenalty() {
        if (isDelayed()) return 10;
        return 0;
    }
}
