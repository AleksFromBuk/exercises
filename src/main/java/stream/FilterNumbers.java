package stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Метод filter() используется чаще всего. Нужен он чтобы оставить
 * в стриме только объекты, которые удовлетворяют условию
 * Например,
 * List.of(-1, 0, 1, 2).stream().filter(n -> n > 0);
 *
 * // оставить в стриме только положительные числа
 *
 *  Ваша задача отфильтровать список, оставив в нем только четные числа
 */

public class FilterNumbers {
    public static List<Integer> filter(List<Integer> data) {
        return data.stream()
                .filter(c -> c % 2 == 0)
                .collect(Collectors.toList());
    }
}