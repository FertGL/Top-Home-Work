package less_40;

public class Main {
    public static void main(String[] args) {
        House house1 = new House(3, false, 4);
        House house2 = new House.Builder()
                .presenceOfGarage(true)
                .roomsCount(5)
                .floursCount(9)
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
