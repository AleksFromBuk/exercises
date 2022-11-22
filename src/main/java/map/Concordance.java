package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> res = new HashMap<>();
        char[] tmp = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 32) {
               res.putIfAbsent(s.charAt(i), new ArrayList<Integer>());
               res.get(s.charAt(i)).add(i);
            }

        }
        return res;
    }
}