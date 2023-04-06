package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        var actual1 = App.take(numbers1, 2);
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(actual1).isEqualTo(expected1);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        var actual2 = App.take(numbers2, 8);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        assertThat(actual2).isEqualTo(expected2);

        List<Integer> numbers3 = new ArrayList<>();
        var actual3 = App.take(numbers3, 8);
        List<Integer> expected3 = new ArrayList<>();
        assertThat(actual3).isEqualTo(expected3);

        List<Integer> numbers4 = new ArrayList<>(Arrays.asList(7, 3, 10));
        var actual4 = App.take(numbers4, 0);
        List<Integer> expected4 = new ArrayList<>();
        assertThat(actual4).isEqualTo(expected4);

        List<Integer> numbers5 = new ArrayList<>(Arrays.asList(7, 3, 10));
        var actual5 = App.take(numbers5, -2);
        List<Integer> expected5 = new ArrayList<>();
        assertThat(actual5).isEqualTo(expected5);

        List<Integer> numbers6 = new ArrayList<>(Arrays.asList(7, 3, 10, 1));
        var actual6 = App.take(numbers6, 4);
        List<Integer> expected6 = new ArrayList<>(Arrays.asList(7, 3, 10, 1));
        assertThat(actual6).isEqualTo(expected6);
        // END
    }
}
