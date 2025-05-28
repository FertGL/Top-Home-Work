package Servers.Paterns.Facade;

import java.util.Random;

enum HotelType {
    ONE_STAR,
    TWO_STAR,
    TREE_STAR,
    FOUR_STAR,
    FIVE_STAR
}

class HotelBooking {
    public int bookHotel(HotelType type, int days) {
        return switch (type) {
            case ONE_STAR -> 100 * days;
            case TREE_STAR -> 140 * days;
            case FOUR_STAR -> 155 * days;
            case FIVE_STAR -> 300 * days;
            default -> 0;
        };
    }
}

enum TripType {
    BUS,
    TRAIN,
    FLIGHT
}

class TripBooking {
    Random random = new Random();
    public double bookTrip(TripType type, String form, String to) {
        int distance = random.nextInt(4900) + 100;

        return switch (type) {
            case BUS ->  distance * 0.5;
            case TRAIN -> distance * 1.5;
            case FLIGHT ->  distance * 3.5;
            default -> 0;
        };
    }
}


enum GuideType{
    NONE,
    AUDI,
    PERSON
}
//
//class CuideBooking {
//    public double bookGuid(GuideType type) {
//
//        return switch (type) {
//            case NONE ->  distance * 0.5;
//            case AUDI -> distance * 1.5;
//            case PERSON ->  distance * 3.5;
//            default -> 0;
//        };
//    }
//}




public class Main {

}
