package less_42;

public class MotorTransport extends WheeledTransport{
    private String engineType;

    public MotorTransport(int wheelCount, int maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен двигатель - " + getEngineType());
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

}
