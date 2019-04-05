package ia.bagenholm;

public class Main {

    //TODO: Classes: Elevator, passenger, simulation, request.

    public static void main(String[] args) {
	    Simulation simulation = new Simulation();
	    simulation.generatePassengers();
	    simulation.generateRequests();

//	    simulation.requests.forEach(request -> System.out.println(request.toString()));

//	    simulation.passengers.forEach(passenger -> System.out.println(passenger.toString()));

    }
}
