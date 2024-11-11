package less_44.List_Operation;

import java.util.List;

public class ListOperations {
    public List<String> addStudent(List<String> list, String name) {
        list.add(name);
        return list;
    }

    public List<String> addAllStudents(List<String> list, List<String> list2) {
        list.addAll(list2);
        return list;
    }

    public List<String> removeStudents(List<String> list, String name) {
        list.remove(name);
        return list;
    }

    public List<String> removeStudents(List<String> list, int index) {
        list.remove(index);
        return list;
    }

    public boolean containsStudents(List<String> list, String name) {
        if (list.contains(name)) {
            System.out.println(name + " присутствует");
            return true;
        } else {
            System.out.println("Нет студента с именем " + name);
            return false;
        }
    }

    public boolean containsStudents(List<String> list, List<String> list2) {
        if (list.containsAll(list2)) {
            System.out.println("Эти студенты присутствуют");
            return true;
        } else {
            System.out.println("Таких студентов нет");
            return false;
        }
    }

    public Integer studentsCount(List<String> list) {
        if (!list.isEmpty()) {
            System.out.println(list.size());
            return list.size();
        } else {
            System.out.println("Список пуст");
            return list.size();
        }
    }

    public List<String> clearList(List<String> list) {
        list.clear();
        System.out.println(list);
        return list;
    }
}
