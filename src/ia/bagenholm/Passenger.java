package ia.bagenholm;

import java.util.ArrayList;

public class Passenger {

    private int id;
    private ArrayList<Integer> waitingTimes = new ArrayList<>();
    private ArrayList<Integer> travelTimes = new ArrayList<>();
    private int currentFloor;
    private int preferredFloor;

    public Passenger(int id, int preferredFloor) {
        this.id = id;
        this.preferredFloor = preferredFloor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getWaitingTimes() {
        return waitingTimes;
    }

    public void setWaitingTimes(ArrayList<Integer> waitingTimes) {
        this.waitingTimes = waitingTimes;
    }

    public ArrayList<Integer> getTravelTimes() {
        return travelTimes;
    }

    public void setTravelTimes(ArrayList<Integer> travelTimes) {
        this.travelTimes = travelTimes;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getPreferredFloor() {
        return preferredFloor;
    }

    public void setPreferredFloor(int preferredFloor) {
        this.preferredFloor = preferredFloor;
    }

    @Override
    public String toString() {
        return "ID="+id+", preferredFloor="+preferredFloor;
    }
}
