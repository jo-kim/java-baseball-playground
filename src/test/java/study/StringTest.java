package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String[] num = "1,2".split(",");
        assertThat(num).contains("1", "2");

        String[] num2 = "1".split(",");
        assertThat(num2).containsExactly("1");

        String word = "(1,2)";
        String substring = word.substring(1, word.length() - 1);
        assertThat(substring).isEqualTo("1,2");

        String letter = "abc";
        assertThat(letter.charAt(0)).isEqualTo('a');
        assertThat(letter.charAt(1)).isEqualTo('b');
        assertThat(letter.charAt(2)).isEqualTo('c');
        assertThatThrownBy(() -> {
            char a = letter.charAt(3);
            throw new Exception("범위 초과");
        }).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String");

        assertThatExceptionOfType(IndexOutOfBoundsException.class).isThrownBy(() -> {
            char c = letter.charAt(3);
            System.out.println(c);
            throw new Exception("범위초과");
        }).withMessageContaining("String");
    }
}
