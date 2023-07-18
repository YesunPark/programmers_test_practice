package Level1.크기가작은부분문자열;
//https://school.programmers.co.kr/learn/courses/30/lessons/147355
// 23.07.18 20분

class Solution {

    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();

        for (int i = 0; i < t.length() - pLen + 1; i++) {
            long num = Long.parseLong(t.substring(i, (i + pLen)));

            if ((num <= Long.parseLong(p))) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("500220839878", "7"));
    }
}
