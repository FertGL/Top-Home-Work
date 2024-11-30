package less_48;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("Сделать просроченные др", 1, "Home work"));
        taskList.add(new Task("Пойти на работу",3,"Useless"));
        taskList.add(new Task("Сделать дз",2, "Home work"));
        taskList.add(new Task("",1,"Home work"));

        taskList.sort(new TaskManager());

        for (Task tasks : taskList) {
            System.out.println(tasks);
        }
    }
}
