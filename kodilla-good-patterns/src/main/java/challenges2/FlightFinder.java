package challenges2;



public class FlightFinder {
    public static void main(String[] args) {
        System.out.println(FlightChecker.searchByArrivalAirport("Monaco"));
        System.out.println(FlightChecker.searchByDepartureAirport("Warsaw"));
        System.out.println(FlightChecker.searchForConnectingFlights("Warsaw", "London",
                "New York"));

    }
}