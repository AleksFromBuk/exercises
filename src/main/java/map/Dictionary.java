package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        List<String> listForStart = new ArrayList<>();
        for (String it : strings) {
            StringBuilder start = new StringBuilder();
            String tmp = start.append(it.charAt(0)).toString();
            if (rsl.containsKey(tmp)) {
                rsl.get(tmp).add(it);
            }
            else {
                List<String> tmpLoadList = new ArrayList<>();
                tmpLoadList.add(it);
                rsl.put(tmp, tmpLoadList);
            }
        }
        return rsl;
    }
}
// -------------------- решение Alex G ---------------------------
//public class Dictionary {
//    public static Map<String, List<String>> collectData(String[] strings) {
//        Map<String, List<String>> rsl = new HashMap<>();
//        for (String str : strings) {
//            String charAtFirstPos = String.valueOf(str.charAt(0));
//            rsl.putIfAbsent(charAtFirstPos, new ArrayList<>());
//            rsl.get(charAtFirstPos).add(str);
//        }
//        return rsl;
//    }
//}