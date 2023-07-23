package Level0.공백으로구분하기2;
// https://school.programmers.co.kr/learn/courses/30/lessons/181868
// 23.07.23 10분

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public String[] solution(String my_string) {
        List<String> strArr = new ArrayList<>();

        for (String str : my_string.split(" ")) {
            if (!"".equals(str)) {
                strArr.add(str);
            }
        }

        return strArr.toArray(new String[0]);
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("i      love   you")));
    }
}
