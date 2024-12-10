package less_58.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Gleb",21));
        studentsList.add(new Student("Andrey",20));
        studentsList.add(new Student("Misha",22));

        Comparator<Student> studentComparator = (o1, o2) -> {
            if (o1.getName().compareTo(o2.getName()) == 0) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        };

        studentsList.sort(studentComparator);

    }
}
