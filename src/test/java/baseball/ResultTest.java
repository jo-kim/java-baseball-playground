package baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ResultTest {

    @Test
    void 결과값() {
        Result rs = new Result();
        String result = rs.getResult(Arrays.asList(3, 4, 6), Arrays.asList(2, 4, 3));

        Assertions.assertThat(result).isEqualTo("1Ball 1Strike");

    }

}