package Level0.x사이의개수;
// https://school.programmers.co.kr/learn/courses/30/lessons/181867
// 23.07.24 30분 소요

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();
        String[] strArr = myString.split("x");

        for (String str : strArr) {
            list.add(str.length());
        }

        if ("x".equals(myString.substring(myString.length() - 1))) {
            list.add(0);
        }
        // 이 과정을 myString.split("x", -1) 로 대체할 수 있음...!
        // split 함수 두번째 인자에 대해 처음 알게되었다.

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("xoxoxoooxoxoxoxox")));
    }
}
