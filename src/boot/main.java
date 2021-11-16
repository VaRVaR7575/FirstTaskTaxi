package boot;

import cars.EconomClass;
import cars.PassengerCar;
import cars.BussinesClass;
import sorting.SortingFuel;
import cars.TaxiFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import Price.PriceTaxi;
import sorting.SortingSpeed;



public class main {
    public static void main(String[] arg){
        BussinesClass Audi = (BussinesClass) TaxiFactory.create("Audi");
        BussinesClass Bently = (BussinesClass) TaxiFactory.create("Bently");
        BussinesClass Mersedes = (BussinesClass) TaxiFactory.create("Mersedes");
        EconomClass Lada = (EconomClass) TaxiFactory.create("Lada");
        EconomClass Reno = (EconomClass) TaxiFactory.create("Reno");
        EconomClass Hyundai = (EconomClass) TaxiFactory.create("Hyundai");


        List<PassengerCar> passengerCar = Arrays.asList(Audi,Bently,Mersedes,Lada,Reno,Hyundai);
//        System.out.print(passengerCar);
        passengerCar.sort(new SortingFuel());
        for (PassengerCar pC : passengerCar) {
            System.out.println(pC);
        }
        System.out.println("Общая стоимость автопарка: " + PriceTaxi.Price(Audi,Bently,Mersedes,Lada,Hyundai,Reno));
        System.out.println("Заданный диапазон скорости" + SortingSpeed.spd(passengerCar, 0,351));








    }
}
