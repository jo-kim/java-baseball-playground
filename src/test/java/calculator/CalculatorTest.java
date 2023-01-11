package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void matchPattern() {
        Calculator c = new Calculator();

        boolean a = c.patternMatch("2 * 3 + 5 / 2");
        assertThat(a).isTrue();
    }

    @Test
    void stringToInt() {
        Calculator c = new Calculator();
        int i = c.toInt("2*3+5/2");

        assertThat(i).isInstanceOf(Integer.class);
    }

    @Test
    void splitCorrect() {
        Calculator c = new Calculator();
        String[] split = c.split("2 * 3 + 5 / 2");

    }

}