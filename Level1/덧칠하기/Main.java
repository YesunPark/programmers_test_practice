package Level1.덧칠하기;
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
// 23.08.02 20분

class Solution {

    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int startSection = 0;
        int lastSection = 0;

        for (int i = 0; i < section.length; i++) {
            // 현재 칠해야 하는 구역이 lastSection 보다 같거나 작다면 패스
            if (section[i] <= lastSection) {
                continue;
            }
            startSection = section[i];
            lastSection = startSection + m - 1;
            answer++;
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            4, 1, new int[]{1,2,3,4}
        ));
    }

}
