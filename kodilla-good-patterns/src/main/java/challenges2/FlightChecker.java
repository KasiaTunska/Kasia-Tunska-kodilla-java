package challenges2;

public class FlightChecker {
    public static void main(String[] args) {

  FlightFinder flightFinder = new FlightFinder();

  flightFinder.findFlightBasedOnDeparture("Wroclaw");
  flightFinder.findFlightBasedOnArrival ("Milan");
  flightFinder.findFlightToThrough("Wroclaw","Gdansk");



    }
}
