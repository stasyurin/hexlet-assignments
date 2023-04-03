package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
class App {
    public static boolean scrabble(String letters, String word) {
        List<Character> lettersList = charListFromString(letters);
        List<Character> wordList = charListFromString(word);

        for (var wordLetter : wordList) {
            if (lettersList.contains(wordLetter)) {
                lettersList.remove(wordLetter);
            } else {
                return false;
            }
        }

        return true;
    }
    private static List<Character> charListFromString(String s) {
        List<Character> list = new ArrayList<>();
        for (var ch : s.toLowerCase().toCharArray()) {
            list.add(ch);
        }
        return list;
    }
}
//END
