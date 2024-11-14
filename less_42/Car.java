package less_42;

import java.util.Objects;

public class Car extends MotorTransport
        implements Comparable<WheeledTransport>{
    private String model;
    private String brand;

    public Car(int wheelCount, int maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }


    @Override
    public void service() {
        super.service();
        System.out.println("Обслужили машину марки - " + getBrand() + " , модель: " + getModel());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(brand, car.brand) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model, brand);
    }

    public int compareTo(Car o) {
        return super.compareTo(o);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                super.toString() + '}';
    }
}
