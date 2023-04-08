package Level0.주사위의개수;
// 23.04.08 10분 소요

class Solution {
    public int solution(int[] box, int n) {
        int answer = 1;

        for (int i = 0; i < box.length; i++) {
            answer *= box[i] / n;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 1, 1}, 1));
    }
}
