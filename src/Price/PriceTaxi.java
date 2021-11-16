package Price;
import cars.EconomClass;
import cars.PassengerCar;
import cars.BussinesClass;
import cars.TaxiFactory;

import java.util.ArrayList;

public class PriceTaxi {
    public static int Price(PassengerCar ... daniksosal){
        int totalPrice = 0;
        for (PassengerCar i : daniksosal){
            totalPrice = totalPrice + i.getCost();
        }
        return totalPrice;
    }
}
