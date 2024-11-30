package less_48;

public class Task {
    protected String nameOfTask;
    protected int priority;
    protected String category;

    public Task(String nameOfTask, int priority, String category) {
        this.nameOfTask = nameOfTask;
        this.priority = priority;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task{" +
                "nameOfTask='" + nameOfTask + '\'' +
                ", priority=" + priority +
                ", category='" + category + '\'' +
                '}';
    }
}
