package less_42;

public class Bicycle extends WheeledTransport{
    private String bicycleType;

    public Bicycle(int wheelCount, int maxSpeed, String bicycleType) {
        super(wheelCount, maxSpeed);
        this.bicycleType = bicycleType;
    }

    @Override
    public void service() {
        System.out.println("Обслужен велосипед типа - " + getBicycleType());
    }

    public String getBicycleType() {
        return bicycleType;
    }

    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }
}
