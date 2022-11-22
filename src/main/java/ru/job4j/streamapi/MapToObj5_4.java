package ru.job4j.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class MapToObj5_4 {
    public static List<Character> symbols(String string) {
        return string
                .chars().
                mapToObj( x -> (char) x)
                .collect(Collectors.toList());
    }
}
