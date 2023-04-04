package 대문자와소문자_프로그래머스입문; //https://school.programmers.co.kr/learn/courses/30/lessons/120893

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        my_string.chars().mapToObj(i -> (char) i)
                .forEach(i -> {
                    if ((int) i <= 90) {
                        answer.append((char) (i + 32));
                    } else {
                        answer.append((char) (i - 32));
                    }
                });

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("cccCCC"));
    }
}
