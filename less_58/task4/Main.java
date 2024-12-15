package less_58.task4;

import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","fig","date","kiwi","grape");

        List<String> newWords = words.stream()
                .map(w -> w.toUpperCase())
                .filter(w -> w.length() > 4)
                .sorted((w1,w2) -> Integer.compare(w1.length(),w2.length()))
                .toList();

        System.out.println(newWords);
    }
}
