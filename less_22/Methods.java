package less_22;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String[] arrToCompare = {"Hello", "Ola", "How are u"};
        System.out.println(Square(3));
        PrintFullName("Gleb", "Fert");
        System.out.println(Arrays.toString(cornerValuesArray(arrToCompare)));
    }

    public static int Square(int x) {
        return (int) Math.pow(x, 2);
    }

    public static void PrintFullName(String name, String surname) {
        System.out.println("Full name: " + name + " " + surname);
    }

    public static String[] cornerValuesArray(String[] strArray) {
        String[] newStrArr = new String[2];
        for (String firstArr : strArray) {
            if (newStrArr[0] == null) {
                newStrArr[0] = firstArr;
            } else if (newStrArr[0].length() > firstArr.length()) {
                newStrArr[0] = firstArr;
            }
            if (newStrArr[1] == null) {
                newStrArr[1] = firstArr;
            } else if (newStrArr[1].length() < firstArr.length()) {
                newStrArr[1] = firstArr;
            }
        }
        return newStrArr;
    }
}
