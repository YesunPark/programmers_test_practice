package Level0.암호해독; //https://school.programmers.co.kr/learn/courses/30/lessons/120892

class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for (int i = code - 1; i < cipher.length(); i += code) {
            answer.append(cipher.split("")[i]);
        }

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("dfjardstddetckdaccccdegk", 4));
    }

}
