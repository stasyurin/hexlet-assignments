package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {
    public static long getCountOfFreeEmails(List<String> domens) {
        return domens.stream()
                .filter(domen -> isDomenFree(domen))
                .count();
    }
    private static boolean isDomenFree(String domen) {
        return domen.endsWith("gmail.com")
                || domen.endsWith("yandex.ru")
                || domen.endsWith("hotmail.com");
    }
}
// END
