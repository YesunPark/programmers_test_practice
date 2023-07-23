package Level0.공백으로구분하기1;
// https://school.programmers.co.kr/learn/courses/30/lessons/181869
// 23.07.23 5분

import java.util.Arrays;

class Solution {

    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("i love you")));
    }
}
