package less_40;

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

    public House(Builder builder) {
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
}
