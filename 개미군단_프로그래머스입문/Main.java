package 개미군단_프로그래머스입문;

class Solution {
    public int solution(int hp) {
        int hp5 = 0;
        int hp3 = 0;
        int hp1 = 0;

        while (hp > 0) {
            if (hp >= 5) {
                hp5 = hp / 5;
                hp %= 5;

                hp3 = hp / 3;
                hp %= 3;

                hp1 = hp;
                hp = 0;
            } else if (hp >= 3) {
                hp3 = hp / 3;
                hp %= 3;

                hp1 = hp;
                hp = 0;
            } else {
                hp1 = hp;
                hp = 0;
            }
        }

        return hp5 + hp3 + hp1;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(4));
    }
}
