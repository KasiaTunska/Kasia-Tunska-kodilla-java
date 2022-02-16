package challenges2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public final class FlightDatabase {

    public static List<Flight> getTheFlightsList() {
        List<Flight> theFlightsList = new ArrayList<>();
        theFlightsList.add(new Flight("Warsaw", "London"));
        theFlightsList.add(new Flight("London", "New York"));
        theFlightsList.add(new Flight("Monaco", "Moscow"));
        theFlightsList.add(new Flight("Bergamo", "Monaco"));
        theFlightsList.add(new Flight("London", "Monaco"));
        theFlightsList.add(new Flight("Mumbai", "Rabat"));
        return new ArrayList<>(theFlightsList);
    }
}
