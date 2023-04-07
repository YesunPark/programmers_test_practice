// 23.4.7 5분 소요 https://school.programmers.co.kr/learn/courses/30/lessons/120850

package Level0.문자열정렬하기1;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();


        for (char str : my_string.toCharArray()) {
            if ((int) str >= 48 && (int) str <= 57) {
                list.add(Integer.valueOf(str + ""));
            }
        }

        Collections.sort(list);

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("hi12392"));
    }
}
