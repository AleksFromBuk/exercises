package list;

import java.util.List;

public class RemoveIf {
    public static List<String> sortList(List<String> list) {
        list.removeIf(String -> String.length() < 5);
        return list;
    }
}
