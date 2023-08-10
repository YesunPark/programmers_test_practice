package Level1.나머지가1이되는수찾기;
// https://school.programmers.co.kr/learn/courses/30/lessons/87389
// 23.08.10 5분

class Solution {

    public int solution(int n) {
        int answer = Integer.MAX_VALUE;

        for (int x = n - 1; x > 0; x--) {
            if (n % x == 1 && x < answer) {
                answer = x;
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

}
