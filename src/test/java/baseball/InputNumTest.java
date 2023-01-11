package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InputNumTest {


    @Test
    void 문자열일까() {
        InputNum in = new InputNum();
        Assertions.assertThat(in.checkNumber("sss")).isFalse();
        Assertions.assertThat(in.checkNumber("111")).isTrue();

    }

    @Test
    void 세글자이어야만해() {
        InputNum in = new InputNum();
        Assertions.assertThat(in.userNumLength("sss")).isTrue();
    }
}