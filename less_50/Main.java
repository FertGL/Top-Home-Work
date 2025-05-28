package less_50;

import java.util.*;

public class Main {
    protected static HashMap<Character, Integer> letterMap = new HashMap<>();
    protected static String str = "java is fun and java is powerful";

    public static void main(String[] args) {
    }

    public static void Task1() {
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == ' ')) {
                if (letterMap.containsKey(str.charAt(i))) {
                    letterMap.put(str.charAt(i), letterMap.get(str.charAt(i)) + 1);
                } else {
                    letterMap.put(str.charAt(i), 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static <K, V> boolean soloWords(HashMap<K, V> map) {
        boolean isSolo = false;
        for (Map.Entry<Character, Integer> entry : letterMap.entrySet()) {
            if (entry.getValue() == 1) {
                isSolo = true;
            } else {
                isSolo = false;
            }
        }
        return isSolo;
    }

    //Как я понял в задании просится вернуть сколько в среднем встречается символ
    public static <K, V> double averageOfChars(HashMap<K, V> map, String str) {
        String newStr = str.replaceAll(" ", "");
        return (double) (newStr.length() - 1) / map.size();
    }

    public static void Task2() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String str = "!!! Java is Fun and java IS powerful !!!";
        String clearStr = str.replaceAll("[^a-zA-Z\\s]", "").strip().toLowerCase();
        String[] strArr = clearStr.split(" ");

        for (String words : strArr) {
            if (treeMap.containsKey(words)) {
                treeMap.put(words, treeMap.get(words) + 1);
            } else {
                treeMap.put(words, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void reverseKeyValue() {
        HashMap<Integer, String> initialMap = new HashMap<>();
        LinkedHashMap<String, Integer> resultMap = new LinkedHashMap<>();
        initialMap.put(1, "C");
        initialMap.put(2, "B");
        initialMap.put(3, "A");

        for (Map.Entry<Integer, String> e : initialMap.entrySet()) {
            resultMap.put(e.getValue(), e.getKey());
        }

        System.out.println(initialMap);
        System.out.println(resultMap);
    }
}
