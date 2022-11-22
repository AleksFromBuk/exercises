package stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк. Вам нужно к каждой строке прибавить ".java"
 *
 * Например, из {"One"} нужно получить {"One.java"}
 */

public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream()
                .map(x -> x + ".java")
                .collect(Collectors.toList());
    }
}

/**
 * ---------------- решение 2 -------------------------
 * return names.stream()
 *                 .map(s -> s.concat(".java"))
 *                 .collect(Collectors.toList());
 */