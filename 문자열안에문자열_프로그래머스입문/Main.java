package 문자열안에문자열_프로그래머스입문;


class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) answer = 1;
        else {
            answer = 2;
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
    }
}
