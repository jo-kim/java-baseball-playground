package calculator;

import java.util.ArrayList;
import java.util.List;
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

    // 문자열 중 사칙부호
    public boolean buhoCheck(String letter) {

        if ("+-*/".contains(letter))
            return true;
        return false;
    }

    // 계산
    public void calculate(String letter) {
        String[] questions = split(letter);
        List<Integer> nums = new ArrayList<>();
        String buho = "";
        for (String question : questions) {
            if (!buhoCheck(letter)) {
                nums.add(Integer.parseInt(question));
            } else
                buho = question;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (buho.contains("+"))
                add(nums.get(i), nums.get(i + 1));
            if (buho.contains("-"))
                minus(nums.get(i), nums.get(i + 1));
            if (buho.contains("*"))
                multiple(nums.get(i), nums.get(i + 1));
            if (buho.contains("/"))
                divide(nums.get(i), nums.get(i + 1));
        }


    }

    private int add(int first, int second) {
        return first + second;
    }

    private int minus(int first, int second) {
        return first - second;
    }

    private int multiple(int first, int second) {
        return first * second;
    }

    private int divide(int first, int second) {
        return first / second;
    }


    public int toInt(String letter) {
        return Integer.parseInt(letter);
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();
        String s = c.inputString();
        c.calculate(s);
    }
}
