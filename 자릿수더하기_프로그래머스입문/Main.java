package 자릿수더하기_프로그래머스입문;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = n + "";

        for (String s : str.split("")) {
            answer += Integer.parseInt(s);
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((s.solution(1234)));
    }

}