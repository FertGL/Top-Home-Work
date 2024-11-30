package less_50.task_4;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> personList = new ArrayList<>();

        personList.add(new Person(21, "Gleb"));
        personList.add(new Person(19, "Oleg"));
        personList.add(new Person(20, "Denis"));
        personList.add(new Person(21, "Dima"));

        Comparator<Person> ageComparator = new AgeComparator();
        personList.sort(ageComparator);
        System.out.println(personList);

        Comparator<Person> nameComparator = new NameComparator();
        personList.sort(nameComparator);
        System.out.println(personList);

    }
}
