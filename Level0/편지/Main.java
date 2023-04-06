package Level0.편지;

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
