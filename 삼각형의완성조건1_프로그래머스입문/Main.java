package 삼각형의완성조건1_프로그래머스입문;

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        answer = sides[2] < sides[0] + sides[1] ? 1 : 2;

        return answer;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 2, 3}));
    }
}