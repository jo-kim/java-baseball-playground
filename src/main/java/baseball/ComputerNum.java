package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static baseball.InputNum.NUM_SIZE;

public class ComputerNum {

    public int randomNum() {
        Random rn = new Random();
        return rn.nextInt(9) + 1;
    }

    // 컴퓨터 숫자 받기
    public List<Integer> getRandomNums() {

        List<Integer> comNums = new ArrayList<>();
        while (comNums.size() < NUM_SIZE) {
            int rnNum = randomNum();
            if (comNums.contains(rnNum))
                continue;
            else {
                comNums.add(rnNum);
            }
        }
        return comNums;
    }
}
