package less_44;

public class Car implements Comparable<Car> {
    private String model;
    private String color;
    private int year;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(Car car) {
        int modelCompare = model.compareTo(car.model);
        if (modelCompare == 0) {
            Integer.compare(year, car.year);
            if (year == car.year) {
                color.compareTo(car.color);
            }
        }
        return modelCompare;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
