package study;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    void checkSize() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("요구사항2")
    void checkContainsNumber(int input) {
        assertThat(numbers.contains(input)).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"1", "2", "3", "4", "5"})
    @DisplayName("요구사항3")
    void checkTrueOrFalse(int input) {
        if (input < 4) {
            assertThat(numbers.contains(input)).isTrue();
        }else{
            assertThat(numbers.contains(input)).isFalse();
        }
    }
}
