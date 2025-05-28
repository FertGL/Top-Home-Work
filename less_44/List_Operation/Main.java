package less_44.List_Operation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        ArrayList<String> students2 = new ArrayList<>();

        ListOperations operations = new ListOperations();
        operations.addStudent(students,"Gleb");
        operations.addStudent(students,"Oleg");
        operations.addStudent(students,"Max");

        operations.addStudent(students2,"Denis");
        operations.addStudent(students2,"Masha");
        operations.addStudent(students2,"Olga");

        operations.addAllStudents(students,students2);

        operations.removeStudents(students,"Gleb");
        System.out.println(students);
        operations.removeStudents(students2,2);
        System.out.println(students2);

        operations.containsStudents(students,"Max");
        operations.containsStudents(students,students2);

        operations.studentsCount(students);
        operations.clearList(students);
    }
}
