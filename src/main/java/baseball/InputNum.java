package baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputNum {

    public final static int NUM_SIZE = 3;

    // 사용자 숫자 받기
    public String inputNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        return sc.next();
    }


    public List<Integer> stringToIntNum(String userNum) {
        List<Integer> userNumbers = new ArrayList<>();

        for (int i = 0; i < userNum.length(); i++) {
            if (checkNumber(userNum) && userNumLength(userNum)) {
                userNumbers.add(Character.getNumericValue(userNum.charAt(i)));
            }

        }
        return userNumbers;
    }

    boolean checkNumber(String userNum) {
        for (int i = 0; i < userNum.length(); i++) {
            int ascii = userNum.charAt(i); // toCharArray()
            if (ascii < 48 || ascii > 57) {
                System.out.println("숫자만 입력하세요!");
                return false;
            }

        }
        return true;
    }

    public boolean userNumLength(String userNum) {
        if (userNum.length() == NUM_SIZE)
            return true;
        System.out.println("세자리만 입력하시오!");
        return false;
    }


}
