package challenges2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightChecker {

    public static List<Flight> searchByDepartureAirport(String departCity) {
        return FlightDatabase.getTheFlightsList().stream()
                .filter(f -> f.getDepartureCity().equals(departCity))
                .collect(Collectors.toList());

    }

    public static List<Flight> searchByArrivalAirport(String arrivalCity) {
        return FlightDatabase.getTheFlightsList().stream()
                .filter(f -> f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList());

    }

    public static List<Flight> searchForConnectingFlights(String departCity, String connectingCity, String arrivalCity) {
        List<Flight> result = FlightDatabase.getTheFlightsList().stream()
                .filter(f -> (f.getDepartureCity().equals(departCity)) && (f.getArrivalCity().equals(connectingCity)))
                .collect(Collectors.toList());

        result.addAll(FlightDatabase.getTheFlightsList().stream()
                .filter(f -> f.getDepartureCity().equals(connectingCity) && f.getArrivalCity().equals(arrivalCity))
                .collect(Collectors.toList()));
        return result;

    }
}



