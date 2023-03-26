import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        Scanner sc = new Scanner(System.in);
        long inputPrice = sc.nextLong();
        long restPrice = 0;

        // 다시 풀어보는 코드.
        // 피드백 : 이 과제는 코드를 구현하는 부분이 중요하기 합니다.
        // 다만, 로직 구현에 포커싱 하기 보다는 주어진 문제를 정확히 이해하고, 이를 분석해서
        // 중복 데이터가 없도록 이에 맞는 코드와 데이터화 하는 부분을 중점적으로 고민해 주시면 좋을 듯 합니다.

        System.out.printf("%10d *  6%% =%12d\n", inputPrice < 12000000 ? inputPrice : 12000000, (int) (inputPrice * 0.06));
        if (12000000 < inputPrice) {
            restPrice = inputPrice - 12000000;
            System.out.printf("%10d * 15%% =%12d\n", inputPrice <= 46000000 ? restPrice : 34000000, (int) (restPrice * 0.15));
        }
        if (46000000 < inputPrice) {
            restPrice = inputPrice - 46000000;
            System.out.printf("%10d * 24%% =%12d\n", inputPrice <= 88000000 ? restPrice : 42000000, (int) (restPrice * 0.24));
        }
        if (88000000 < inputPrice) {
            restPrice = inputPrice - 88000000;
            System.out.printf("%10d * 35%% =%12d\n", inputPrice <= 150000000 ? restPrice : 62000000, (int) (restPrice * 0.35));
        }
        if (150000000 < inputPrice) {
            restPrice = inputPrice - 150000000;
            System.out.printf("%10d * 38%% =%12d\n", inputPrice <= 300000000 ? restPrice : 150000000, (int) (restPrice * 0.38));
        }
        if (300000000 < inputPrice) {
            restPrice = inputPrice - 300000000;
            System.out.printf("%10d * 40%% =%12d\n", inputPrice <= 500000000 ? restPrice : 200000000, (int) (restPrice * 0.40));
        }
        if (500000000 < inputPrice) {
            restPrice = inputPrice - 500000000;
            System.out.printf("%10d * 42%% =%12d\n", inputPrice <= 1000000000 ? restPrice : 500000000, (int) (restPrice * 0.42));
        }
        if (1000000000 < inputPrice) {
            restPrice = inputPrice - 1000000000;
            System.out.printf("%10d * 45%% =%12d\n", restPrice, (int) (restPrice * 0.45));
        }

//////////////////////////////////////
// 과제제출했던 코드
//        if (inputPrice < 12000000) {
//            System.out.printf("%10d *  6%% =%12d\n", inputPrice, (int) (inputPrice * 0.06));
//        }
//        if (12000000 < inputPrice && inputPrice <= 46000000) {
//            restPrice = inputPrice - 12000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", restPrice, (int) (restPrice * 0.15));
//        }
//        if (46000000 < inputPrice && inputPrice <= 88000000) {
//            restPrice = inputPrice - 46000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", 34000000, (int) (34000000 * 0.15));
//            System.out.printf("%10d * 24%% =%12d\n", restPrice, (int) (restPrice * 0.24));
//        }
//        if (88000000 < inputPrice && inputPrice <= 150000000) {
//            restPrice = inputPrice - 88000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", 34000000, (int) (34000000 * 0.15));
//            System.out.printf("%10d * 24%% =%12d\n", 42000000, (int) (42000000 * 0.24));
//            System.out.printf("%10d * 35%% =%12d\n", restPrice, (int) (restPrice * 0.35));
//        }
//        if (150000000 < inputPrice && inputPrice <= 300000000) {
//            restPrice = inputPrice - 150000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", 34000000, (int) (34000000 * 0.15));
//            System.out.printf("%10d * 24%% =%12d\n", 42000000, (int) (42000000 * 0.24));
//            System.out.printf("%10d * 35%% =%12d\n", 62000000, (int) (62000000 * 0.35));
//            System.out.printf("%10d * 38%% =%12d\n", restPrice, (int) (restPrice * 0.38));
//        }
//        if (300000000 < inputPrice && inputPrice <= 500000000) {
//            restPrice = inputPrice - 300000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", 34000000, (int) (34000000 * 0.15));
//            System.out.printf("%10d * 24%% =%12d\n", 42000000, (int) (42000000 * 0.24));
//            System.out.printf("%10d * 35%% =%12d\n", 62000000, (int) (62000000 * 0.35));
//            System.out.printf("%10d * 38%% =%12d\n", 150000000, (int) (150000000 * 0.38));
//            System.out.printf("%10d * 40%% =%12d\n", restPrice, (int) (restPrice * 0.40));
//        }
//        if (500000000 < inputPrice && inputPrice <= 1000000000) {
//            restPrice = inputPrice - 500000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", 34000000, (int) (34000000 * 0.15));
//            System.out.printf("%10d * 24%% =%12d\n", 42000000, (int) (42000000 * 0.24));
//            System.out.printf("%10d * 35%% =%12d\n", 62000000, (int) (62000000 * 0.35));
//            System.out.printf("%10d * 38%% =%12d\n", 150000000, (int) (150000000 * 0.38));
//            System.out.printf("%10d * 40%% =%12d\n", 200000000, (int) (200000000 * 0.40));
//            System.out.printf("%10d * 42%% =%12d\n", restPrice, (int) (restPrice * 0.42));
//        }
//        if (1000000000 < inputPrice) {
//            restPrice = inputPrice - 1000000000;
//            System.out.printf("%10d *  6%% =%12d\n", 12000000, (int) (12000000 * 0.06));
//            System.out.printf("%10d * 15%% =%12d\n", 34000000, (int) (34000000 * 0.15));
//            System.out.printf("%10d * 24%% =%12d\n", 42000000, (int) (42000000 * 0.24));
//            System.out.printf("%10d * 35%% =%12d\n", 62000000, (int) (62000000 * 0.35));
//            System.out.printf("%10d * 38%% =%12d\n", 150000000, (int) (150000000 * 0.38));
//            System.out.printf("%10d * 40%% =%12d\n", 200000000, (int) (200000000 * 0.40));
//            System.out.printf("%10d * 42%% =%12d\n", 500000000, (int) (500000000 * 0.42));
//            System.out.printf("%10d * 45%% =%12d\n", restPrice, (int) (restPrice * 0.45));
//        }

        Calculator cal = new Calculator();
        long result = cal.calculate(inputPrice);

        System.out.println();
        System.out.printf("[세율에 의한 세금]:        %15d\n", result);
        System.out.printf("[누진공제 계산에 의한 세금]: %15d\n", result);
    }
}

class Calculator {
    public long calculate(long inputPrice) {
        long result = 0;
        if (inputPrice < 12000000) {
            result = (long) (inputPrice * 0.06);
        }
        if (12000000 < inputPrice && inputPrice <= 46000000) {
            result = (long) (inputPrice * 0.15) - 1080000;
        }
        if (46000000 < inputPrice && inputPrice <= 88000000) {
            result = (long) (inputPrice * 0.24) - 5220000;
        }
        if (88000000 < inputPrice && inputPrice <= 150000000) {
            result = (long) (inputPrice * 0.35) - 14900000;
        }
        if (150000000 < inputPrice && inputPrice <= 300000000) {
            result = (long) (inputPrice * 0.38) - 19400000;
        }
        if (300000000 < inputPrice && inputPrice <= 500000000) {
            result = (long) (inputPrice * 0.40) - 25400000;
        }
        if (500000000 < inputPrice && inputPrice <= 1000000000) {
            result = (long) (inputPrice * 0.42) - 35400000;
        }
        if (1000000000 < inputPrice) {
            result = (long) (inputPrice * 0.45 - 65400000);
        }
        return result;
    }
}