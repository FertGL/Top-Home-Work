package less_40;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> listOfHouses = new ArrayList<>();
        House house1 = new House(3, false, 4);
        House house2 = new House.Builder()
                .presenceOfGarage(true)
                .roomsCount(5)
                .floursCount(9)
                .build();

        House house3 = new House.Builder()
                .presenceOfGarage(false)
                .roomsCount(3)
                .floursCount(2)
                .build();
        House house4 = new House.Builder()
                .presenceOfGarage(true)
                .roomsCount(3)
                .floursCount(2)
                .build();

        listOfHouses.add(house1);
        listOfHouses.add(house2);
        listOfHouses.add(house3);
        listOfHouses.add(house4);

        for (House houses : listOfHouses) {
            System.out.println(houses);
        }


        System.out.println(listOfHouses.contains(house3));
        System.out.println(listOfHouses.contains(house4));
        System.out.println(listOfHouses.indexOf(house4));
        System.out.println(listOfHouses.indexOf(house3));

        if (house3.equals(house4)) {
            System.out.println("Равны");
            System.out.println(house3.hashCode());
            System.out.println(house4.hashCode());
        }
    }
}
