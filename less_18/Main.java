package less_18;

public class Main {
    public static void main(String[] args) {
        task2();
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
        String st = "HelloolleH";
        boolean b = false;
        StringBuilder firtPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder();

        for (int i = 0; i <= (st.length() - 1) / 2; i++) {
                firtPart.append(st.charAt(i));
        }
        for (int a = st.length() - 1; a >= (st.length())/2 ; a--) {
                secondPart.append(st.charAt(a));
        }

        if ((String.valueOf(firtPart).toLowerCase()).equals(String.valueOf(secondPart).toLowerCase())) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }

//            for (int a = st.length() - 1; a >= (st.length() - 1)/2 ; a--) {
//                StringBuilder firtPart = new StringBuilder();
//                firtPart.append(st.charAt(i));
//                System.out.print(firtPart);
//                StringBuilder secondPart = new StringBuilder();
//                secondPart.append(st.charAt(a));
//                System.out.println(secondPart);
//                if (firtPart.equals(secondPart)) {
//                    b = true;
//                } else {
//                    b = false;
//                }
//            }

//        if (b) {
//            System.out.println("Это палиндром");
//        } else {
//            System.out.println("Это не палиндром");
//        }
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
