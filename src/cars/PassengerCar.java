package cars;

import java.util.Objects;

public abstract class PassengerCar {
private int cost;
private int fuel;
private int speed;
private int id;
private String name;

public PassengerCar(int cost, int fuel, int speed,String name,int id ){
    this.cost = cost;
    this.fuel = fuel;
    this.speed = speed;
    this.name = name;
    this.id = id;
}
public int getFuel(){
    return fuel;
}
public int getCost(){
    return cost;
}
public int getSpeed(){
    return speed;
}
public int getId(){
    return id;
}
public String getName(){
    return name;
}

public void setCost(int cost){
    this.cost = cost;
}

public void setFuel(int fuel){
    this.fuel = fuel;
}

public void setId(int id) {
    this.id = id;
}
public void setSpeed(int Speed){
    this.speed = speed;
}

public void setName(String name) {
    this.name = name;
}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerCar that = (PassengerCar) o;
        return cost == that.cost &&
                fuel == that.fuel &&
                speed == that.speed &&
                id == that.id &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, fuel, speed, id, name);
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "cost=" + cost +
                ", fuel=" + fuel +
                ", speed=" + speed +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}