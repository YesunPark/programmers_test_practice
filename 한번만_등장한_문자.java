import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution1 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < s.split("").length; i++) {
            if (hm.get(s.split("")[i]) != null) {
                hm.put(s.split("")[i], hm.get(s.split("")[i]) + 1);
            } else {
                hm.put(s.split("")[i], 1);
            }
        }

        hm.forEach((key, value) -> {
            if (value == 1)
                arrayList.add(key);
        });

        int[] numList = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            numList[i] = arrayList.get(i).toCharArray()[0];
        }

        Arrays.sort(numList);
        for (int j : numList) {
            answer.append((char) j);
        }

        return answer.toString();
    }
}

public class 한번만_등장한_문자 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.solution("aabhtycccccrrrc"));
    }
}
