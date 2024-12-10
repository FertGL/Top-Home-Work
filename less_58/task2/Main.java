package less_58.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Gleb","Sergey","Vitalii");

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };
        names.sort(comparator);
        System.out.println(names);

        Comparator<String> comparator1 = (o1, o2) -> o1.compareTo(o2);
        names.sort(comparator1);
        System.out.println("Сортировка с помошью лямбда - " + names);
    }
}
