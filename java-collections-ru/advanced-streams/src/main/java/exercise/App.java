package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String confFileData) {
        return Arrays.stream(confFileData.split("\n"))
                .filter(x -> x.startsWith("environment"))
                .map(x -> x.substring("environment=\"".length(), x.length() - 1))
                .flatMap(x -> Arrays.stream(x.split(",")))
                .filter(x -> x.startsWith("X_FORWARDED"))
                .map(x -> x.substring("X_FORWARDED_".length()))
                .collect(Collectors.joining(","));
    }
}
//END
