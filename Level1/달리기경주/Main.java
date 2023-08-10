package Level1.달리기경주;
// https://school.programmers.co.kr/learn/courses/30/lessons/178871
// 23.07.30 분 - 15:10~

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] result = players.clone();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

//        for (String calledName : callings) {
//            int rank = map.get(calledName);
//            String person = map.values();
//            map.put()
//        }

//
        List<String> list = new ArrayList<>(Arrays.asList(players));

        System.out.println(list.get(list.size() - 1));

        for (int i = 0; i < callings.length; i++) {
            String name = callings[i];
            int idx = list.indexOf(name); // 추월한 선수의 현재 idx
            String person = list.get(idx - 1); // 추월당할 선수의 이름 임시저장
            list.set(idx, person);
            list.set(idx - 1, name);
        }

        return list.toArray(new String[0]);
    }

//    class Solution1 {
//
//        public String[] solution(String[] players, String[] callings) {
//            List<String> list = new ArrayList<>(Arrays.asList(players));
//
//            for (int i = 0; i < callings.length; i++) {
//                String name = callings[i];
//                int idx = list.indexOf(name);
//                String person = list.get(idx - 1);
//                list.set(idx, person);
//                list.set(idx - 1, name);
//            }
//
//            return list.toArray(new String[0]);
//        }
//    }
}

public class Main {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(
            new String[]{"mumu", "soe", "poe", "kai", "mine"},
            new String[]{"kai", "kai", "mine", "mine"})));
    }

}
