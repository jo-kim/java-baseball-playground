package calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void setUp() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void arrayStringTest() {
        String str = "1+3";
        assertThat(stringCalculator.arrayString(str))
                .contains(String.valueOf(1))
                .contains(String.valueOf('+'))
                .contains(String.valueOf(3));
    }

    @Test
    void checkAnswer() {
        assertThat(stringCalculator.calculate(1, '+', 3)).isEqualTo(4);
    }


}
