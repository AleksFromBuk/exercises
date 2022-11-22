package ru.job4j.streamapi;

import java.util.List;

public class AllMatchMethod {
    //задача проверить, что переданный список содержит строки, длина которых больше 3.
    public static boolean check(List<String> list) {
        return list.stream()
                .allMatch(n -> n.length() > 3);
    }
}
