package racingCar;

import java.util.Scanner;

public class CarName {


    public String writeCarName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.");
        String carName = sc.next();

        return carName;
    }


    // 자동차 이름 5글자 초과시
    public boolean checkLength(String carName) {
        if (carName.length() > 5)
            return false;
        return true;
    }

    // 자동차 이름 쉼표 구분


}
