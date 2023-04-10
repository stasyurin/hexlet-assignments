package exercise;

import java.util.*;

// BEGIN
class App {
    public static Map<String,String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String,String> result = new LinkedHashMap<>();
        for (var key : map1.keySet()) {
            if (map2.get(key) == null) {
                result.put(key, "deleted");
            } else {
                result.put(key, "unchanged");
            }
        }
        for (var key : map2.keySet()) {
            var map1Val = map1.get(key);
            if (map1Val == null) {
                result.put(key, "added");
            } else if (!map1Val.equals(map2.get(key))) {
                result.put(key, "changed");
            }
        }
        return result;
    }
}
//END
