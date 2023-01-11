package baseball;

import java.util.Scanner;

public class Play {
    public boolean playYn() {
        System.out.println("다시 시작하시겠습니까?\n [1] YES \n [2] 종료");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c == '1')
            return true;
        return false;
    }
}
