package calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void matchPattern() {
        Calculator c = new Calculator();

        boolean a = c.patternMatch("+ 2 * 3 + 5 / 2");
        assertThat(a).isTrue();
    }

//    @Test
//    void stringToInt() {
//        Calculator c = new Calculator();
//        int i = c.toInt("2*3+5/2");
//
//        assertThat(i).isInstanceOf(Integer.class);
//    }

    @Test
    void splitCorrect() {
        Calculator c = new Calculator();
        String[] split = c.split("2 * 3 + 5 / 2");
    }

    @Test
    void calculateCorrect() {
        Calculator c = new Calculator();
        String[] a = c.split("2 + 3 * 4 / 2");
        List<Integer> num = new ArrayList<>();
        String buho = "";

    }

    @Test
    void resultCorrect() {
        Calculator c = new Calculator();
        double result = c.calculate("2 + 3 * 4 / 2");

        System.out.println(result);
    }

}