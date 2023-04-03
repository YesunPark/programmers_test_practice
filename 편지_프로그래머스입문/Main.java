package 편지_프로그래머스입문;

class Solution {
    public int solution(String message) {
        return message.length() * 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("happy birthday!"));
    }
}
