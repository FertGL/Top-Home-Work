package less_20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    static void task1() {
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
        double sum = 0;

        for (int arrays : arr) {
            sum +=arrays;
        }

        sum = (sum / arr.length);
        System.out.println("Среднее значение элементов массива: " + sum);
    }

    static void task2() {
        final double MIN_VALUE = -1.4;
        final double MAX_VALUE = 7.8;
        double[] array = {3.5,5.2,-1.4,7.8,2.2};

        boolean containsValue = false;

        if (Arrays.asList(array).contains(MIN_VALUE) || Arrays.asList(array).contains(MAX_VALUE)) {
            containsValue = true;
        }
    }

    static void task3() {
        int count = 0;
        char[] chars = {'a','B','i','t','E','r'};
        char[] alsoChars = {'a','e','i','o','u'};

        for(char ch : chars) {
//            for (char chs : alsoChars) {
//                if(String.valueOf(ch).toLowerCase().equals(String.valueOf(chs).toLowerCase())) {
//                    count++;
//                }
//            }
            if((Arrays.asList(chars).contains(ch))) {
                count++;
            }
        }
        System.out.println(count);
    }

    static void task4() {
        String str = "Hello World This Is Java";
        String newStr = str.replaceAll(" ","_");
        System.out.println(newStr);


        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (ch == ' ') {
                ch = '_';
            }
            System.out.print(ch);
        }
    }

    static void task5() {
        String str = "apple,banana,grape,orange";
        String[] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));
    }
}
