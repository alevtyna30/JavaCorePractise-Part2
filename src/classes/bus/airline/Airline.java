package classes.bus.airline;

import java.time.LocalDateTime;

public class Airline {
    private String destination;
    private Integer flightNumber;
    private String type;
    private LocalDateTime departureTime;
    private int dayOfWeek;

    public Airline(String destination, Integer flightNumber, String type, LocalDateTime departureTime, int dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.type = type;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", type='" + type + '\'' +
                ", departureTime=" + departureTime +
                ", dayOfWeek=" + dayOfWeek +
                '}';
    }
}
