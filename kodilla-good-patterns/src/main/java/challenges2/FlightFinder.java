package challenges2;



 class FlightFinder {
    public static void main(String[] args) {
        FlightChecker flightScanner = new FlightChecker();
        flightScanner.lookForDepartureAirport("WMI");
        flightScanner.lookForArrivalAirport("WRO");
        flightScanner.lookForConnectingAirport("WAW", "WRO");
    }
}
