package Level1.둘만의암호;
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
// 23.08.16 40분

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {

    public String solution(String s, String skip, int index) {
        // a ~ z : 97 ~ 122
        StringBuilder answer = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 97; i <= 122; i++) {
            list.add(i);
        }

        for (String skipNumber : skip.split("")) {
            list.remove((Object) ((int) skipNumber.toCharArray()[0]));
        }

        for (String str : s.split("")) {
            int strIdx = list.indexOf((int) str.toCharArray()[0]);
            int actualIdx = (strIdx + index) % list.size();
            char actualChar = (char) (int) (list.get(actualIdx));
            answer.append(actualChar);
        }

        return answer.toString();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(
            "aukks", "wbqd", 5
        ));
    }
}
