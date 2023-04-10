package Level0._369게임;
// 23.04.10 15분 소요

class Solution {
    public int solution(int order) {
        int answer = 0;

        String str = order + "";
        for (int i = 0; i < str.length(); i++) {
            int num = Integer.valueOf(str.split("")[i]);
            if (num == 3 || num == 6 || num == 9) answer++;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3));
    }
}
