package classes.bus;

import java.time.LocalDate;
import java.util.List;


public class BusTest {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Petrov I.O.",2, 56,"Mazda",
                LocalDate.of(2000,12,1),45000);
        Bus bus2 = new Bus("Petrov I.O.",6, 56,"Mazda",
                LocalDate.of(1999,5,23),300000);
        Bus bus3 = new Bus("Petrov I.O.",2, 56,"Mazda",
                LocalDate.of(1991,6,30),31000);
        Bus bus4 = new Bus("Petrov I.O.",2, 56,"Mazda",
                LocalDate.of(1986,4,5),450000);
        Bus bus5 = new Bus("Petrov I.O.",1, 56,"Mazda",
                LocalDate.of(1997,1,1),230000);
        Bus bus6 = new Bus("Petrov I.O.",7, 56,"Mazda",
                LocalDate.of(1998,7,8),750000);

        BusList busList = new BusList();

        busList.addToBusList(bus1);
        busList.addToBusList(bus2);
        busList.addToBusList(bus3);
        busList.addToBusList(bus4);
        busList.addToBusList(bus5);
        busList.addToBusList(bus6);

        busList.getBusByRouteNumber(2);
        busList.getBusWhichOperationYearMoreThenRequireOrder(30);
        List<Bus> getBusesListByMileage = busList.getBusesListByMileage(500000);
        System.out.println(getBusesListByMileage);


    }
}
