package less_18;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    static void task() {
        String st = "qwerewq";
        StringBuilder sb = new StringBuilder();
        sb.append(st).reverse();
        if(st.contentEquals(sb)) {
            System.out.println("Палиндром");
        }
    }

    static void task2() {
        String st = "Gbdder";
        boolean b = false;

        for (int i = 0; i <= st.length() - 1; i++) {
            for (int a = st.length() - 1; a >= 0; a--) {
                if (st.charAt(i) == st.charAt(a)) {
                    b = true;
                } else {
                    b = false;
                }
            }
        }

        if (b) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    static void task3() {
        int numb = 1234321;
        StringBuilder sb = new StringBuilder();

        int reversNumb = Integer.parseInt(String.valueOf(sb.append(numb).reverse()));

        if (numb % reversNumb == 0) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }
}
