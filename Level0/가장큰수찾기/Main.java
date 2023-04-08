package Level0.가장큰수찾기;
// 23.04.09 7분 소요

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = Integer.MIN_VALUE;
        int idx = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
                idx = i;
            }
        }

        answer[0] = maxNum;
        answer[1] = idx;

        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 8, 3}));
    }
}
