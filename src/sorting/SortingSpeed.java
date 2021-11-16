package sorting;
import cars.PassengerCar;
import cars.TaxiFactory;
import cars.BussinesClass;
import cars.EconomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingSpeed {
    public static ArrayList<String> spd(List<PassengerCar> arr, int a,int b){
        ArrayList<String> carName = new ArrayList<>();
        for (PassengerCar passengerCar: arr) {
            if (passengerCar.getSpeed() > a && passengerCar.getSpeed()< b)
                carName.add(passengerCar.getName());
        }
        return carName;
    }
}
