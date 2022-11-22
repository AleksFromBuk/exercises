package map;

import java.util.*;

public class MostUsedCharacter  {
    public static char getMaxCount(String str) {
        String tmp = str.toLowerCase().replaceAll(" ", "");
        TreeMap<Character, Integer> data = new TreeMap<>();
        char rsl = ' ';
        for (int i = 0; i < tmp.length(); i++) {
            rsl = tmp.charAt(i);
            data.computeIfPresent(rsl, (key, value) -> value + 1);
            data.putIfAbsent(rsl, 1);
        }

        List<Map.Entry<Character, Integer>> colect =
                new ArrayList<>(data.entrySet());
        Collections.sort(colect, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> a, Map.Entry<Character, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });

        for (int i = colect.size() - 1; i >= 1; i--) {
            if (colect.get(i - 1).getValue()
                    != colect.get(i).getValue()) {
                rsl = colect.get(i).getKey();
                break;
            }
        }
        //return colect.get(colect.size() - 1).getKey();

//        int ma = 0;
//        int ttmp;
//        for (Character it : data.keySet()) {
//            ttmp = data.get(it);
//            if (ttmp > ma) {
//                rsl = it;
//                ma = ttmp;
//            }
//        }
        return rsl;
    }
}