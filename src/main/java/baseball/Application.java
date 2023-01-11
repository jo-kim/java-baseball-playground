package baseball;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        ComputerNum computerNum = new ComputerNum();
        InputNum playerNum = new InputNum();
        Result result = new Result();
        Play playYn = new Play();
        boolean play = true;

        while (play) {
            List<Integer> randomNums = computerNum.getRandomNums();
            System.out.println(randomNums);
            String answer = "";
            while (play && !answer.contains("3 Strike")) {
                answer = result.getResult(randomNums, playerNum.stringToIntNum(playerNum.inputNum()));
                System.out.println(answer);
            }
            play = playYn.playYn();


        }
    }
}
