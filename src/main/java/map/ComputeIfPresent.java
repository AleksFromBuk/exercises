package map;

import java.util.Map;

public class ComputeIfPresent {
    public static Map<Integer, String> collectData(
            Map<Integer, String> name, Map<Integer, String> surname) {
        for(Integer it: name.keySet()) {
            name.computeIfPresent(it, (key, value) -> value + " " + surname.get(it));
        }
        return name;
    }
}