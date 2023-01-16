package calculator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {

    static final String pattern = "^\\d( [+\\-*\\/] \\d){1,}$";

    // 사용자 문자열 입력받기
    public String inputString() {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        return letter;
    }

    // 사용자가 입력한 문자열이 숫자 + 사칙연산 조합인지 확인
    public boolean patternMatch(String letter) {
        return Pattern.matches(pattern, letter);
    }

    // 입력 받은 문자열 split
    public String[] split(String letter) {
        return letter.split(" ");
    }


    public int calculate(String letter) {
        String[] questions = split(letter);
        int result = Integer.parseInt(questions[0]);

        String buho = "";
        int nums = 0;

        for (int i = 0; i < questions.length; i++) {
            if (i % 2 != 0) {
                buho = questions[i];
                continue;
            }
            nums = Integer.parseInt(questions[i]);
            if ("+".equals(buho)) result += nums;
            if ("-".equals(buho)) result -= nums;
            if ("*".equals(buho)) result *= nums;
            if ("/".equals(buho)) result /= nums;
        }
        return result;
    }


    public static void main(String[] args) {

        Calculator c = new Calculator();
        String s = c.inputString();
        c.calculate(s);
    }
}
