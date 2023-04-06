package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> retval = new ArrayList<>();
        for (var book : books) {
            if (match(book, where)) {
                retval.add(book);
            }
        }
        return retval;
    }
    private static boolean match(Map<String, String> book, Map<String, String> where) {
        for (var kv: where.entrySet()) {
            if (book.get(kv.getKey()) != kv.getValue()) {
                return false;
            }
        }
        return true;
    }
}
//END
