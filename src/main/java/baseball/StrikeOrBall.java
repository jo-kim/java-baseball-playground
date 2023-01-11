package baseball;

import java.util.List;

public class StrikeOrBall {

    public int strike(List<Integer> comNums, List<Integer> userNums) {
        int strike = 0;
        for (int i = 0; i < userNums.size(); i++) {
            if (comNums.get(i) == userNums.get(i))
                strike++;
        }
        return strike;
    }

    public int ball(List<Integer> comNums, List<Integer> userNums) {
        int ball = 0;
        for (int i = 0; i < userNums.size(); i++) {
            if (!comNums.get(i).equals(userNums.get(i)) && comNums.contains(userNums.get(i)))
                ball++;

        }
        return ball;
    }

}
