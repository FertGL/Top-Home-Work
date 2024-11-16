package less_42;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        Car car = new Car(4, 150, "patrol", "BMW", "M5");
        Bicycle bicycle = new Bicycle(2, 60, "mountain");
        Truck truck = new Truck(6, 120, "diesel", 1000);
        ServiceStation station = new ServiceStation();
        station.service(car);
        station.service(bicycle);
        station.service(truck);

        cars.add(car);
        cars.add(new Car(4, 340, "diesel", "Mersedes", "E250"));
        cars.add(new Car(4,270,"patrol","Shkoda","oktavia"));

        Collections.sort(cars);

        for (Car cars1 : cars) {
            System.out.println(cars1);
        }
    }

}
