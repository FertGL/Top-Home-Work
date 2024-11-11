package less_42;

public class Truck extends MotorTransport{
    private int maxWeight;

    public Truck(int wheelCount, int maxSpeed, String engineType, int maxWeight) {
        super(wheelCount, maxSpeed, engineType);
        this.maxWeight = maxWeight;
    }


    @Override
    public void service() {
        System.out.println("Обслужили рузоподьемный транспорт, грузоподьемность: " + getMaxWeight() + " ,тип " +
                "двигателя: " + getEngineType());
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
