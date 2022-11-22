package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonUniqueString {
    public static Map<String, Boolean> checkData(String[] strings) {
        Set<String> filtr = new HashSet<>();
        Map<String, Boolean> result = new HashMap<>();
        for (String it : strings) {
            if (!filtr.add(it)) {
                result.put(it, true);
            } else {
                result.put(it, false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        byte x = 64;
        int i;
        i = x << 2;
        byte y = (byte) (x << 2);
        System.out.println( i + " " + y);
    }
}