package stream;

import java.util.List;

/**
 * 2.4. Понятие редукции. Метод min(). Поиск кратчайшей строки
 *
 * Как вы наверное уже догадались поиск минимального элемента
 * представляет собой также редукцию. Этот метод принимает
 * Comparator и возвращает Optional. Если список пуст вернется
 * пустой Optional.
 *
 * Пример, *
 * Integer min = List.of(3, 2, 1).stream()
 * .min((n1, n2) -> Integer.compare(n1, n2)).get();
 * // вернет 1
 *
 * Ваша задача найти строку с минимальной длиной. Размер списка больше 0
 */

public class MinMethod {
    public static String min(List<String> list) {
//        String mi = list.stream()
//                .min((a, b) -> CharSequence.compare(a, b)).get();
//        return mi;
        return list.stream().min((n1, n2) -> n1.compareTo(n2)).get();

    }
}