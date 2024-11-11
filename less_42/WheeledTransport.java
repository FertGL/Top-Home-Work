package less_42;

public class WheeledTransport implements Transport {
    private int wheelCount;
    private int maxSpeed;

    public WheeledTransport(int wheelCount, int maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public void service() {
        System.out.println("Обслужено колес - " + getWheelCount());
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
