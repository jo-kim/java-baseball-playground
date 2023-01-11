package baseball;

import java.util.List;

public class Result {

    StrikeOrBall sb = new StrikeOrBall();

    public String getResult(List<Integer> comNums, List<Integer> userNums) {
        int ball = sb.ball(comNums, userNums);
        int strike = sb.strike(comNums, userNums);

        if (ball != 0)
            System.out.println(ball + " Ball");
        if (strike != 0)
            System.out.println(strike + " Strike");
        if (strike == 0 && ball == 0)
            System.out.println(" Nothing");
        return ball + "Ball" + strike + " Strike"; // 0 ball 0strike nothing
    }
}
