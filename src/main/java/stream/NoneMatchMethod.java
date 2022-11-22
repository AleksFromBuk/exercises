package stream;

import java.util.List;

/**
 * Чтобы проверить, что ни один элемент стрима не удовлетворяет
 * условию можно использовать метод noneMatch() *
 * Например, *
 * List.of(1, 2, 3).stream().noneMatch(n -> n == 0); // проверяем, что нет нулей
 *
 * Ваша задача проверить, что в списке нет пустых строк
 */

public class NoneMatchMethod {
    public static boolean check(List<String> list) {
        return list.stream().noneMatch(String::isEmpty);
    }
}