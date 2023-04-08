package Level0.n의배수고르기;
// 23.4.9 5분 소요

import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) list.add(numlist[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
    }
}
