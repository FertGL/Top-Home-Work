package less_28;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static int[] oldArr = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        int[][] intArr = new int[3][3];
        Matrix(intArr);

        System.out.println("Старый массив изначально: " + Arrays.toString(oldArr));
        newArr(oldArr);
        System.out.println("После использования его копии ссылки в методе " + Arrays.toString(oldArr));
        OldArr();
        System.out.println("После использования этого массива в методе" + Arrays.toString(oldArr));
    }

    /**
     * Метод принимает двумерный массив int, запонлняет его числами от 1 до 9, выводит в консоль: этот массив в виде
     * матрицы, суммы чисел в стоках, суммы чисел в столбцах
     *
     * @param arr массив int
     */
    public static void Matrix(int[][] arr) {
        Random random = new Random();
        int sumOfStroke1 = 0;
        int sumOfStroke2 = 0;
        int sumOfStroke3 = 0;
        int sumOfColumn1 = 0;
        int sumOfColumn2 = 0;
        int sumOfColumn3 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(1, 9);
            }
        }
        for (int[] intArr1 : arr) {
            for (int intArr2 : intArr1) {
                System.out.print(intArr2 + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                switch (i) {
                    case 0 -> sumOfStroke1 += arr[0][j];
                    case 1 -> sumOfStroke2 += arr[1][j];
                    case 2 -> sumOfStroke3 += arr[2][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sumOfColumn1 += arr[i][0];
            sumOfColumn2 += arr[i][1];
            sumOfColumn3 += arr[i][2];
        }
        System.out.println(
                "Сумма чисел первой строки: " + sumOfStroke1 + "\n"
                        + "Сумма чисел второй строки: " + sumOfStroke2 + "\n"
                        + "Сумма чисел третьей строки: " + sumOfStroke3 + "\n"
                        + "Сумма чисел первого столбца: " + sumOfColumn1 + "\n"
                        + "Сумма чисел второго столбца: " + sumOfColumn2 + "\n"
                        + "Сумма чисел третьего столбца: " + sumOfColumn3 + "\n"

        );
    }

    /**
     * Принимает массив int, изминяет копию этого массива
     * @param arr массив int
     */
    public static void newArr(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        newArr[1] = 10;
    }

    /**
     * Метод меняет массив oldArr
     */
    public static void OldArr() {
        oldArr[1] = 3;
    }

}

