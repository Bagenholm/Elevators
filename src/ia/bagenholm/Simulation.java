package ia.bagenholm;

/*
 * Questions:
    * How many floors and passengers (workers)?
        * Start with a set number, say 10 floors (Entrance 0, 1-10 work floors) 200 passengers.
            * Implement option to change later.
    * How long does it take for an elevator to go to another floor?
        * Open doors, passengers enter, close doors, start motor, travel to target floor,
        * stop motor, open doors, passengers exit, close doors.
    * How often will passengers travel?
         * Elevator traffic patterns: one to many -> many to many -> many to one.
            * One to many up-traffic during morning.
            * Many to many interfloor traffic during day.
            * Many to one down-traffic during evening.
        * Minimum of 2 trips per passenger per day (one up-trip to preferred floor in the first few hours,
          one down-trip in the last few hours).
        * An additional 0-10 trips per day per passenger?
        * Passengers return to their preferred floor after a relatively short time on another floor (~30min-3h?).
    * How long work days?
        * Seconds per day, split into three portions for different traffic patterns.
            * 8-10 hours? 28800 or 36000 seconds. 7200s for 2h.
        * When do passengers arrive?
            * First 2 hours of the day?
                * 0-7200s.
        * When do passengers leave?
            * Last 2 hours of the day?
                * 28800-36000s if 10h day.
    * How many days to simulate?

 * Vars: passengers, requests, elevator

 * Methods:
    * initSimulation()
        * generatePassengers()
            * Creates list of random passengers with unique ID and preferred floors.
        * generateRequests()
            * Creates a list of random requests with passenger ID, time stamp, request floor, target floor.
                * generateMorningRequests()
                    * All passengers go to preferred floor during the first 2h of the day.
                        * 0-7200s
                * generateDayRequests()
                    * Random amount of trips during the "middle" 6h of the day.
                        * 7200-28800s. Total 22000s.
                * generateEveningRequests()
                    * All passengers go to entrance floor during the last 2h of the day.
                        * 28801-36000s.
    * runSimulation()

 * Elevator models to simulate:
    * Non-directional collective control. "First come, first served."
        * Picks up all passengers in its travel direction, drops them off in order of button press.
    * Full collective control.
        * Picks up only passengers going in the elevator's travel direction, drops them off in floor order.
    * Pre-directional control
        * Picks up only passengers going to the same target floor.
            * Can start from elevator's current floor or at passenger with most distance to target floor.
        * Picks up passengers within a blob of floors going to a blob of floors, depending on travel distance.

 */

import java.util.ArrayList;

public class Simulation {
    ArrayList<Passenger> passengers = new ArrayList<>();
    ArrayList<Request> requests = new ArrayList<>();
    Elevator elevator = new Elevator();

    public void generatePassengers() {
        int preferredFloor;
        for (int i = 0; i < 200 ; i++) {
            preferredFloor = (int) (1 + Math.random()*10);
            passengers.add(new Passenger(i, preferredFloor));
        }
    }

    public void generateRequests() {
        requests.clear();
        generateMorningRequests();
//        generateDayRequests();
//        generateEveningRequests();
    }

    private void generateMorningRequests() {
        passengers.forEach(passenger -> requests.add(
                new Request(passenger, 0, passenger.getPreferredFloor(), (int)(1+ Math.random() * 7200))));
    }

}
