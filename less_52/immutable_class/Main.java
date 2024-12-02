package less_52.immutable_class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<ImmutableCLass, Integer> map = new HashMap<>();
        CustomMutableClass cast = new CustomMutableClass(10);
        ImmutableCLass immClass = new ImmutableCLass("name", new ArrayList<>(List.of(1, 2, 3, 4, 5)), cast);
        System.out.println(immClass);
        cast.setValue(15);

        map.put(immClass, 1);
        System.out.println("map - " + map);
        System.out.println("object - " + immClass);
    }
}
