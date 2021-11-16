package sorting;
import java.util.Comparator;
import cars.PassengerCar;


public class SortingFuel implements Comparator<PassengerCar>{
        public int compare (PassengerCar o1, PassengerCar o2){
            return o1.getFuel() - o2.getFuel();
        }

    }

