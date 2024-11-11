package less_42;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, 150, "V8", "BMW", "M5");
        Bicycle bicycle = new Bicycle(2,60,"mountain");
        Truck truck = new Truck(6,120,"diesel",1000);
        ServiceStation station = new ServiceStation();
        station.service(car);
        station.service(bicycle);
        station.service(truck);
    }

}
