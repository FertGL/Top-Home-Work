package less_54;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] intArr = {1, 4, 5, 4, 2, 3, 9, 9, 8, 1, 0};
        int[] numbers = {10, 20, 30, 40, 50};
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        System.out.println(arrToList(intArr));
        System.out.println(arrToLinkedSet(words));
        System.out.println(Arrays.toString(findClosestNumbers(numbers, 10)));
    }

    public static Set<Integer> arrToList(int[] intArr) {
        HashSet<Integer> integerSet = new HashSet<>();

        for (Integer numbers : intArr) {
            integerSet.add(numbers);
        }

        return integerSet;
    }

    public static Set<String> arrToLinkedSet(String[] words) {
        Set<String> linkedSet = new LinkedHashSet<>(Arrays.asList(words));
        return linkedSet;
    }

    public static int[] findClosestNumbers(int[] numbers, int target) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] result = new int[2];

        for (Integer numbs : numbers) {
            treeSet.add(numbs);
        }
        int[] newNumbs = new int[treeSet.size()];
        int k = 0;
        for (Integer numbs : treeSet) {
            newNumbs[k++] = numbs;
        }

        for (int i = 0; i < newNumbs.length; i++) {
            if (newNumbs[i] == target & target != newNumbs[newNumbs.length - 1] & target != newNumbs[0]) {
                result[0] = newNumbs[i - 1];
                result[1] = newNumbs[i + 1];
            } else if (target == newNumbs[newNumbs.length - 1]) {
                result[0] = newNumbs[newNumbs.length - 2];
            } else if (target == newNumbs[0]) {
                result[1] = newNumbs[1];
            }
        }


        return result;
    }
}
