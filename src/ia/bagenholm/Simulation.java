package ia.bagenholm;

/*
 * Elevator traffic patterns: one to many -> many to many -> many to one.
    * One to many up-traffic during morning.
    * Many to many interfloor traffic during day.
    * Many to one down-traffic during evening.

 * How long does it take for an elevator to go to another floor?
    * Open doors, passengers enter, close doors, start motor, travel to target floor,
    * stop motor, open doors, passengers exit, close doors.

 * Methods:
    * generatePassengers
        * Creates list of random passengers with unique ID and preferred floors.
    * generateRequests
        * Creates a list of random requests with passenger ID, time stamp, request floor, target floor.

 * Elevator models to simulate:
    * Non-directional collective control. "First come, first served."
        * Picks up all passengers in its travel direction, drops them off in order of button press.
    * Full collective control.
        * Picks up only passengers going in the elevator's travel direction, drops them off in floor order.
    * Pre-directional control
        * Picks up only passengers going to the same target floor.
            * Can start from elevator's current floor or at passenger with most distance to target floor.

 */

public class Simulation {
}
