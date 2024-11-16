package less_40;

import java.util.Objects;

public class House {
    protected int floursCount;
    protected int roomsCount;
    protected boolean presenceOfGarage;

    public House() {
    }

    public House(int floursCount, boolean presenceOfGarage, int roomsCount) {
        this.floursCount = floursCount;
        this.presenceOfGarage = presenceOfGarage;
        this.roomsCount = roomsCount;
    }

    private House(Builder builder) {
        this.floursCount = builder.floursCount;
        this.presenceOfGarage = builder.presenceOfGarage;
        this.roomsCount = builder.roomsCount;
    }

    @Override
    public String toString() {
        return "House{" +
                "floursCount=" + floursCount +
                ", roomsCount=" + roomsCount +
                ", presenceOfGarage=" + presenceOfGarage +
                '}';
    }

    public static class Builder {
        protected int floursCount;
        protected int roomsCount;
        protected boolean presenceOfGarage;

        public Builder() {
        }

        public Builder floursCount(int floursCount) {
            this.floursCount = floursCount;
            return this;
        }

        public Builder roomsCount(int roomsCount) {
            this.roomsCount = roomsCount;
            return this;
        }

        public Builder presenceOfGarage(boolean presenceOfGarage) {
            this.presenceOfGarage = presenceOfGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floursCount == house.floursCount && roomsCount == house.roomsCount /*&& presenceOfGarage == house.presenceOfGarage*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floursCount, roomsCount, presenceOfGarage);
    }
}
