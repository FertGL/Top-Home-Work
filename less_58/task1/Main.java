package less_58.task1;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("Hello");

        Printer printer1 = message -> System.out.println(message);
        printer1.print("Hello 2");

        Printer printer2 = message -> {
            System.out.print(message);
            System.out.println(" длинна сообщени - " + message.length());
        };
        printer2.print("Hello 3");
    }
}
