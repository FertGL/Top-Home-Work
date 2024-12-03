package less_56;

public class Main {
    public static void main(String[] args) {
        catchArithmeticException(10,0);
    }

    public static double catchArithmeticException(int a, int b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }


}
