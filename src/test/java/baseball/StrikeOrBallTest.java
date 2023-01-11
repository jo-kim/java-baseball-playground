package baseball;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class StrikeOrBallTest {

    @Test
    void 스트라이크검증() {
        StrikeOrBall sb = new StrikeOrBall();

        int strike = sb.strike(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        assertThat(strike).isEqualTo(3);
    }

    @Test
    void 볼검증() {
        StrikeOrBall sb = new StrikeOrBall();

        int ball = sb.ball(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 1));

        assertThat(ball).isEqualTo(3);
    }

    @Test
    void 스트볼검증() {
        StrikeOrBall sb = new StrikeOrBall();

        int strike = sb.strike(Arrays.asList(2, 3, 6), Arrays.asList(2, 4, 3));
        int ball = sb.ball(Arrays.asList(2, 3, 6), Arrays.asList(2, 4, 3));

        assertThat(strike).isEqualTo(1);
        assertThat(ball).isEqualTo(1);
    }

}