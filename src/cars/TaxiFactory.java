package cars;
import cars.PassengerCar;
import cars.BussinesClass;
import cars.EconomClass;

public class TaxiFactory {
    public static PassengerCar create (String typeOfCars){
        switch (typeOfCars){
            case "Audi" : return new BussinesClass(10000, 90,300,"Audi",1);
            case "Bently" : return new BussinesClass(15000, 100,400,"Bently", 2);
            case "Mersedes" : return new BussinesClass(20000, 80, 350,"Mersedes", 3);
            ///
            case "Hyundai" : return new EconomClass(1000, 20,100,"Hyundai", 4);
            case "Reno" : return new EconomClass(1200, 25, 120, "Reno", 5);
            case "Lada" : return new EconomClass(1500, 30,80,"Lada", 6);
            default:return null;
        }
    }
}
