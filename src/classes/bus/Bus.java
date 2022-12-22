package classes.bus;

import java.time.LocalDate;

public class Bus {
    private String fullName;
    private int busNumber;
    private Integer routeNumber;
    private String brand;
    private LocalDate yearOfStartOperation;
    private int mileage;



    public Bus(String fullName, int busNumber, Integer routeNumber, String brand, LocalDate yearOfOperation, int mileage) {
        this.fullName = fullName;
        this.busNumber = busNumber;
        this.routeNumber = routeNumber;
        this.brand = brand;
        this.yearOfStartOperation = yearOfOperation;
        this.mileage = mileage;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public Integer getRouteNumber() {
        return routeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getYearOfStartOperation() {
        return yearOfStartOperation;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "fullName='" + fullName + '\'' +
                ", busNumber=" + busNumber +
                ", routeNumber=" + routeNumber +
                ", brand='" + brand + '\'' +
                ", yearOfOperation=" + yearOfStartOperation +
                ", mileage=" + mileage +
                '}';
    }
}
