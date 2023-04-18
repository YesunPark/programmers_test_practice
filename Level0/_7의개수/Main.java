package Level0._7의개수;
// https://school.programmers.co.kr/learn/courses/30/lessons/120912
// 23.04.19 5분 소요
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            String num = array[i] + "";
            for (int j = 0; j < num.length(); j++) {
                if (Integer.parseInt(num.split("")[j]) == 7) {
                    answer++;
                }
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7, 77, 17}));
    }
}
