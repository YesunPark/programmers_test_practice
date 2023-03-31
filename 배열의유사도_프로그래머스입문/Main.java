package 배열의유사도_프로그래머스입문;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        ArrayList<String> s1List = new ArrayList<>(Arrays.asList(s1));

        for (String str : s2) {
            if (s1List.contains(str)) {
                answer++;
            }
        }

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
                new String[]{"We", "are", "the", "world!"}
                , new String[]{"a", "b", "c"}));
    }
}
