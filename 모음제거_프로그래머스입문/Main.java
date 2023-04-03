package 모음제거_프로그래머스입문;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        StringBuilder answer = new StringBuilder();
        char[] array = {'a', 'e', 'i', 'o', 'u'};
        ArrayList<Character> vowel = new ArrayList<>();

        for (char c : array) {
            vowel.add(c);
        }

        my_string.chars()
                .mapToObj(i -> (char) i)
                .forEach(i -> {
                    if (!vowel.contains(i)) answer.append(i);
                });

        return answer.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("bus"));
    }
}
