package less_22;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String[] str = new String[]{};
        String[] str2 = new String[]{null};
        String[] str3 = new String[]{"a", "a", "a"};
        System.out.println("String: " + Arrays.toString(cornerValuesArray(str)));
        System.out.println("\t  " + Arrays.toString(cornerValuesArray(str2)));
        System.out.println("\t  " + Arrays.toString(cornerValuesArray(str3)));

        System.out.println("-----------------------------------------");

        char[] ch1 = new char[]{};
        char[] ch2 = new char[]{'a', 'a', 'a'};
        char[] ch3 = new char[]{' ', ' '};
        System.out.println("char: " + Arrays.toString(cornerValuesArray(ch1)));
        System.out.println("\t\t" + Arrays.toString(cornerValuesArray(ch2)));
        System.out.println("\t\t" + Arrays.toString(cornerValuesArray(ch3)));

        System.out.println("-----------------------------------------");

        int[] arr1 = new int[]{};
        int[] arr2 = new int[]{'a', 'a', 'a'};
        int[] arr3 = new int[]{' ', ' '};
        int[] arr4 = new int[]{0};
        System.out.println("int: " + Arrays.toString(cornerValuesArray(arr1)));
        System.out.println("\t " + Arrays.toString(cornerValuesArray(arr2)));
        System.out.println("\t " + Arrays.toString(cornerValuesArray(arr3)));
        System.out.println("\t " + Arrays.toString(cornerValuesArray(arr4)));

        System.out.println("Факториал вашего числа: " + getFactorial(10));
    }

    /**
     * Метод для возведения чисел в квадрат
     *
     * @param x принимает элемент типа int
     * @return Возвращает ваше число в квадрате
     */
    public static int Square(int x) {
        return (int) Math.pow(x, 2);
    }

    /**
     * Выводит конкатенацию строк name и surname
     *
     * @param name    Принимает строку (String) P.S. Ваше имя
     * @param surname Принимает строку (String)
     *                P.S. Ваша фамилия
     */
    public static void PrintFullName(String name, String surname) {
        System.out.println("Full name: " + name + " " + surname);
    }


    /**
     * Метод который выбирает из предоставленных строк самую длинную и самую короткую
     *
     * @param strVarargs Принимает несколько строк
     * @return Возвращает массив с самой короткой и самой длинной строкой
     */
    public static String[] cornerValuesArray(String... strVarargs) {
        if (strVarargs == null || strVarargs.length == 0) {
            return null;
        }

        String[] newStrArr = new String[2];
        for (String firstArr : strVarargs) {
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


    /**
     * Метод который выбирает из предоставленных чисел самое большое и самое маленькое
     *
     * @param intVarargs Принимает несколько значение int
     * @return Возвращает массив с самым большим и самым маленьким числом
     */
    public static int[] cornerValuesArray(int... intVarargs) {
        if (intVarargs == null || intVarargs.length == 0) {
            return null;
        }

        int[] newIntArr = new int[2];
        for (int firstArr : intVarargs) {
            if (newIntArr[0] == 0) {
                newIntArr[0] = firstArr;
            } else if (newIntArr[0] > firstArr) {
                newIntArr[0] = firstArr;
            }
            if (newIntArr[1] == 0) {
                newIntArr[1] = firstArr;
            } else if (newIntArr[1] < firstArr) {
                newIntArr[1] = firstArr;
            }
        }
        return newIntArr;
    }


    /**
     * Метод который выбирает из предоставленных символов(char) самое большое и самое маленькое
     * т.к. у каждого символа есть код в юникоде, их можно сравнивать
     *
     * @param charVarargs Принимает несколько значение char
     * @return Возвращает массив с самоым большим и самым маленьким (кодом/символом)(char)
     */
    public static char[] cornerValuesArray(char... charVarargs) {
        if (charVarargs == null || charVarargs.length == 0) {
            return null;
        }

        char[] newCharArr = new char[2];
        for (char firstArr : charVarargs) {
            if (newCharArr[0] == 0) {
                newCharArr[0] = firstArr;
            } else if (newCharArr[0] > firstArr) {
                newCharArr[0] = firstArr;
            }
            if (newCharArr[1] == 0) {
                newCharArr[1] = firstArr;
            } else if (newCharArr[1] < firstArr) {
                newCharArr[1] = firstArr;
            }
        }
        return newCharArr;
    }

    /**
     * Вычисляет факториал числа f , методом рекурсии
     *
     * @param f int
     * @return Возврашает или число f, если f меньше или равно 1, или произведение f на этот же метод с параметром
     * (f-1) ((Факториал))
     */
    public static int getFactorial(int f) {
        if (f <= 1) {
            return f;
        } else {
            return f * getFactorial(f - 1);
        }
    }
}
