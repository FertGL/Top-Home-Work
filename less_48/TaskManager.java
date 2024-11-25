package less_48;

import java.util.Comparator;


public class TaskManager  implements Comparator<Task> {
    @Override
    public int compare(Task task, Task task2) {
        if (Integer.compare(task.priority, task2.priority) == 0) {
            return task.category.compareTo(task2.category);
        }
        return Integer.compare(task.priority, task2.priority);
    }
}
