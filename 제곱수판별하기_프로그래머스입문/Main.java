package 제곱수판별하기_프로그래머스입문;

class Solution {
    public int solution(int n) {
        int answer = 2;

        for (int i = 1; i <= 1000; i++) {
            if ((int) (Math.pow(i, 2)) == n) {
                answer = 1;
                break;
            }
        }


        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((s.solution(144)));
    }

}