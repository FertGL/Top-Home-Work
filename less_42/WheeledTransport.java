package less_42;

import java.util.Objects;

public class WheeledTransport
        implements Transport, Comparable<WheeledTransport> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WheeledTransport that = (WheeledTransport) o;
        return wheelCount == that.wheelCount && maxSpeed == that.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelCount, maxSpeed);
    }


    @Override
    public int compareTo(WheeledTransport o) {
        return -Integer.compare(maxSpeed, o.maxSpeed);
    }

    @Override
    public String toString() {
        return "WheeledTransport{" +
                "wheelCount=" + wheelCount +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
