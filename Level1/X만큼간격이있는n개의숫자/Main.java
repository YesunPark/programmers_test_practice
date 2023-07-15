package Level1.X만큼간격이있는n개의숫자;
// https://school.programmers.co.kr/learn/courses/30/lessons/12954
// 23.07.15 10분 소요

import java.util.ArrayList;
import java.util.Arrays;

class Solution {

  public long[] solution(int x, int n) {
    ArrayList<Long> list = new ArrayList<>();

    long num = x;
    for (int i = 0; i < n; i++) {
      list.add(num);
      num += x;
    }

    return list.stream().mapToLong(Long::longValue).toArray();
  }
}

public class Main {

  public static void main(String[] args) {
    Solution s = new Solution();
    System.out.println(Arrays.toString(s.solution(-4, 2)));
  }
}
