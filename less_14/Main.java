package less_14;

public class Main {
    public static void main(String[] args) {
    }

    public static void task1() {
        for (int i = 0; i <10; i++ ) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2() {
        int a = 1;
        for (int i = 1; i <= 4; i++) {
            a *= i;
        }
        System.out.println(a);
    }

    public static void task3() {
        for (int i = 1; i <=10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(i + "*" + a + ' ');
            }
        }
    }
}
