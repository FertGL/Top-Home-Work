package less_56.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("BMW", 2005), new Car("Reno", 2010)));
        Car car = new Car("Volkswagen", 2014);
        getCar(car, cars);
    }

    public static Car getCar(Car car, List<Car> cars) {
        try {
            if (!cars.contains(car)) {
                throw new CarNotFoundException("Этой машини нет в списке");
            }
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return car;
    }
}
