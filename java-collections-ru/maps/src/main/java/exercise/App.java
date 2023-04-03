package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<>();
        }
        Map<String, Integer> wordCount = new HashMap<>();
        var words = sentence.split(" ");
        for (var word : words) {
            int wordCounts = 0;
            if (wordCount.containsKey(word)) {
                wordCounts = wordCount.get(word);
            }
            wordCount.put(word, wordCounts + 1);
        }
        return wordCount;
    }
    public static String toString(Map<String, Integer> wordCount) {
        if (wordCount.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        for (Map.Entry<String, Integer> kv: wordCount.entrySet()) {
            stringBuilder.append("  ");
            stringBuilder.append(kv.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(kv.getValue());
            stringBuilder.append("\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
//END
