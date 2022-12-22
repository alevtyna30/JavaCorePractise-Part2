package classes.bus.airline;

import java.time.LocalDateTime;
import java.util.List;

public class AirlineTest {
    public static void main(String[] args) {


        Airline line1 = new Airline("London", 45671, "Jets",
                LocalDateTime.of(2023, 6, 26, 11, 50, 0), 1);
        Airline line2 = new Airline("Paris", 45761, "Jets",
                LocalDateTime.of(2022, 1, 30, 9, 50, 0), 2);
        Airline line3 = new Airline("New York", 76671, "Jets",
                LocalDateTime.of(2020, 2, 18, 11, 50, 0), 7);
        Airline line4 = new Airline("Copenhagen", 59671, "Jets",
                LocalDateTime.of(2019, 3, 25, 10, 50, 0), 7);
        Airline line5 = new Airline("Oslo", 45171, "Jets",
                LocalDateTime.of(2018, 2, 15, 10, 50, 0), 4);
        Airline line6 = new Airline("Warsaw", 47171, "Jets",
                LocalDateTime.of(2017, 1, 25, 10, 50, 0), 5);

        AirlineList list = new AirlineList();
        list.addAirlineToList(line1);
        list.addAirlineToList(line2);
        list.addAirlineToList(line3);
        list.addAirlineToList(line4);
        list.addAirlineToList(line5);
        list.addAirlineToList(line6);

//        List<Airline> newList = list.getFlightListByDestination("London");
//                    System.out.println(newList);
//
//        List<Airline> getFlightsByDay = list.getAirlineListByDayOfTheWeek(5);
//        System.out.println(getFlightsByDay);

        List<Airline> getAirlineListByDayOfTheWeekWhichDepartureTimeMoreThen =
                list.getAirlineListByDayOfTheWeekWhichDepartureTimeMoreThen(7, "00:00");
        System.out.println(getAirlineListByDayOfTheWeekWhichDepartureTimeMoreThen);


    }


}
