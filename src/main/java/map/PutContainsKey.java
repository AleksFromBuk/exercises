package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PutContainsKey {

    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User it : list) {
            rsl.put(it.getId(), it);
        }
        return rsl;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> rsl = new HashMap<>();
        for (User it : list) {
            if (!rsl.containsKey(it.getId())) {
                rsl.put(it.getId(), it);
            }
        }
        return rsl;
    }
}
