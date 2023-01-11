package calculator;

import java.util.Scanner;

public class StringCalculator {


    public String[] arrayString(String str) {
        str = inputLetter();
        return str.split("");
    }

    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    public int calculate(int first, char operator, int second) {

        if (operator == '+') {
            return add(first, second);
        }
        if (operator == '-') {
            return subtract(first, second);
        }
        if (operator == '*') {
            return multiple(first, second);
        }
        if (operator == '/') {
            return divide(first, second);
        }
        throw new RuntimeException("");
    }

    private int divide(int first, int second) {
        return first / second;
    }

    private int multiple(int first, int second) {
        return first * second;
    }

    private int subtract(int first, int second) {

        return first - second;
    }

    private int add(int first, int second) {
        return first + second;
    }

    public int calculateString(String[] str) {
        int result = toInt(str[0]);

        for (int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, str[i + 1].charAt(0), toInt(str[i + 2]));
        }
        return result;
    }

    public boolean isNull(String input) {
        if (input.equals("") || input == null)
            return false;
        return true;
    }

    public int result(String input) {
        if (isNull(input))
            throw new RuntimeException();


        return calculateString(arrayString(input));
    }

    public String inputLetter() {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        return letter;
    }

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        sc.result(sc.inputLetter());
    }
}
