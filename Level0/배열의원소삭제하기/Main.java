package Level0.배열의원소삭제하기;
// https://school.programmers.co.kr/learn/courses/30/lessons/181844
// 23.07.26 5분

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        for (int i = 0; i < delete_list.length; i++) {
            int finalI = i;
            list.removeIf(integer -> integer == delete_list[finalI]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{293, 1000, 395, 678, 94},
            new int[]{94, 777, 104, 1000, 1, 12})));
    }
}
