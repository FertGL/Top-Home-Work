package less_52.Generics;

public class Main {

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        Box<Integer> box2 = new Box<>();

        box1.get();
        box1.set("3");
        box1.clear();
        System.out.println(box1.get());
        System.out.println(box1.isEmpty());
    }
}
