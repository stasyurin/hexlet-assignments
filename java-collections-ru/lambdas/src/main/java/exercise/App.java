package exercise;

import java.util.Arrays;
import java.util.stream.*;

// BEGIN
class App {
    public static String[][] enlargeArrayImage(String[][] image) {
        return Arrays.stream(image)
                .map(x -> Arrays.stream(x)
                        .flatMap(y -> Arrays.stream(new String[] {y, y}))
                        .toArray(String[]::new))
                .flatMap(x -> Arrays.stream(new String[][] {x, x}))
                .toArray(String[][]::new);
    }
}
// END
