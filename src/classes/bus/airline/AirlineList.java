package classes.bus.airline;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineList {

    private List<Airline> airlineList = new ArrayList<>();


    public void addAirlineToList(Airline a) {
        airlineList.add(a);
    }

    List<Airline> getFlightListByDestination(String destination) {
        return airlineList.stream()
                .filter(airline -> airline.getDestination().equals(destination))
                .collect(Collectors.toList());
    }

    List<Airline> getAirlineListByDayOfTheWeek(int day) {
        return airlineList.stream()
                .filter(airline -> airline.getDayOfWeek() == day)
                .collect(Collectors.toList());
    }

    List<Airline> getAirlineListByDayOfTheWeekWhichDepartureTimeMoreThen(int day, String date) {
        List<Airline> result = new ArrayList<>();
        LocalDateTime time = LocalDateTime.parse(date);
        for (Airline a : airlineList) {
            if (a.getDayOfWeek() == day && a.getDepartureTime().isAfter(time));
        }
        return result;
    }
}

