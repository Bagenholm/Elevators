package ia.bagenholm;

/*
 * Vars: passenger, requestFloor, destinationFloor, timeStamp;
 */

public class Request {
    private Passenger passenger;
    private int requestFloor;
    private int destinationFloor;
    private int timeStamp;

    public Request(Passenger passenger, int requestFloor, int destinationFloor, int timeStamp) {
        this.passenger = passenger;
        this.requestFloor = requestFloor;
        this.destinationFloor = destinationFloor;
        this.timeStamp = timeStamp;
    }

    public int getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(int timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getRequestFloor() {
        return requestFloor;
    }

    public void setRequestFloor(int requestFloor) {
        this.requestFloor = requestFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    @Override
    public String toString() {
        return "" + timeStamp + ": ID" + passenger.getId() + ", " + requestFloor + " to " + destinationFloor;
    }
}
