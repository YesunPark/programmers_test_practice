package Level0.약수구하기;
// 23.4.11 3분 소요
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(24));
    }
}
