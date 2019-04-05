package ia.bagenholm;

import java.util.ArrayList;

public class Elevator {

    private int capacity;
    private int currentFloor = 0;
    private boolean isOpen;
    private String travelDirection;
    private ArrayList<Passenger> passengers = new ArrayList<>();

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getTravelDirection() {
        return travelDirection;
    }

    public void setTravelDirection(String travelDirection) {
        this.travelDirection = travelDirection;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
