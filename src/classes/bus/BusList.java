package classes.bus;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BusList {

    private List<Bus> busesList = new ArrayList<>();

    public void addToBusList(Bus b){
        busesList.add(b);
    }

    public void getBusByRouteNumber(Integer number){
        for (Bus b : busesList){
            if(b.getRouteNumber().equals(number)){
                System.out.println(b.toString());
            }
        }
    }

    public void getBusWhichOperationYearMoreThenRequireOrder(int requiredYear){
        for(Bus b : busesList){
            LocalDate now = LocalDate.now();
            LocalDate startOfOperation = LocalDate.from(b.getYearOfStartOperation());
            Period totalYearsOfOperation = Period.between(startOfOperation, now);
            int years = totalYearsOfOperation.getYears();
            if(years>=requiredYear){
                System.out.println(b);
            }
        }
    }

    List<Bus> getBusesListByMileage(int mileage){
        return busesList.stream()
                .filter(bus -> bus.getMileage()>=mileage)
                .collect(Collectors.toList());
    }
}
