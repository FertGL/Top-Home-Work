package Servers.less1;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {-5, 0, 1, 1, 2, 3, 6, 8, 22, 45, 678};
        Integer[] arr2 = {-10, 2, 3, 6, 7, 7, 7, 9, 11, 1000, 1010, 1100};

        System.out.println(Arrays.toString(sumArr(arr,arr2)));
        System.out.println(Arrays.toString(sumArrAnotherTry(arr, arr2)));
    }

    public static Integer[] sumArr(Integer[] one, Integer[] two) {

        Integer[] three = new Integer[one.length + two.length];

        System.arraycopy(one, 0, three, 0, one.length);
        System.arraycopy(two, 0, three, one.length, two.length);

        TreeSet<Integer> treeSet = new TreeSet<Integer>(Arrays.asList(three));

        three = treeSet.toArray(new Integer[0]);

        return three;
        //+ : массив отсортирован
        //- : убрались дубликаты)
    }

    public static Integer[] sumArrAnotherTry(Integer[] one, Integer[] two) {
        Integer[] three = new Integer[one.length + two.length];
        int indexOne = 0;
        int indexTwo = 0;
        int indexThree = 0;

        while (indexTwo < two.length) {
            if ((indexOne < one.length) && (one[indexOne] > two[indexTwo])) {
                three[indexThree] = two[indexTwo];
                indexTwo++;
                indexThree++;

            } else if ((indexOne < one.length) && (one[indexOne] < two[indexTwo])) {
                three[indexThree] = one[indexOne];
                indexOne++;
                indexThree++;

            } else {
                three[indexThree] = two[indexTwo];
                indexTwo++;
                indexThree++;

            }
        }

        return three;
    }
}
