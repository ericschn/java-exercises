package exercises;

import java.util.ArrayList;

public class FiveLetter {
    public static void main(String[] args) {
        ArrayList<String> wordlist = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        wordlist.add("hello");
        wordlist.add("no");
        wordlist.add("extreme");
        wordlist.add("stick");
        wordlist.add("human");

        for (String word : wordlist) {
            if (word.length() == 5) {
                result.add(word);
                System.out.println(word);
            }
        }

        System.out.println(result);
    }
}
