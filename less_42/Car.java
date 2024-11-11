package less_42;

public class Car extends MotorTransport{
    private String model;
    private String brand;

    public Car(int wheelCount, int maxSpeed, String engineType, String brand, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }


    @Override
    public void service() {
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
}
