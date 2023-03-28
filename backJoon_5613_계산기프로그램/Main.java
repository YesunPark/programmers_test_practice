package backJoon_5613_계산기프로그램;
// 백준 답변 작성법 몰라서 답변 검색해서 공부함.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();
        while (true) {
            String s = sc.nextLine();
            if ("=".equals(s)) break;
        }

        System.out.println(str);
        sc.close();
    }
}
