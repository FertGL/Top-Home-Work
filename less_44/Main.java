package less_44;

import java.util.*;

public class Main {
    public static List<String> arrList = new ArrayList<>();
    public static LinkedList<String> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        fillLists();
        takeRandom();
    }

    public static void fillLists() {
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 1_000_000; i++) {
            arrList.add("Привет");
            linkedList.add("Пока");
        }
        long end = System.currentTimeMillis();
        System.out.println("Выполение заняло: " + (end - start));
    }

    public static void takeRandom() {
        fillLists();
        long start = System.currentTimeMillis();
        Collections.shuffle(arrList);
        Collections.shuffle(linkedList);
        Random random = new Random();

        for (int i = 0; i <= 100_000; i++) {
            int take = random.nextInt(0, 1_000_000 - 1);
            arrList.get(take);
            linkedList.get(take);
        }
        long end = System.currentTimeMillis();
        System.out.println("Выполение заняло: " + (end - start));
    }
}
