package stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Метод map() служит для преобразования элементов стрима.
 * Вызвав этот метод, вы преобразуете каждый элемент и получаете
 * стрим из преобразованных элементов.
 * Например,
 * List.of(1, 2, 3).stream().map(n -> 2 * n).collect(Collectors.toList());
 * // получим список 2, 4, 6
 *
 * Ваша задача из заданного списка чисел получить список квадратов этих чисел
 */

public class NumberMap {
    public static List<Integer> map(List<Integer> numbers) {
        return numbers.stream()
                .map( x -> x * x)
                .collect(Collectors.toList());
    }
}