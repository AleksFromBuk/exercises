package stream;

import java.util.List;

/**
 * Стримы примитивов содержат некоторые полезные терминальные операции.
 * Иногда может потребоваться вызвать один из методов. Но что делать,
 * если у нас стрим объектов? Мы можем преобразовать стрим объектов в стрим 
 * примитивов, используя методы mapToInt(), mapToDouble(), mapToLong().
 * Соответственно, в IntStream, DoubleStream, LongStream. Работают эти методы
 * аналогично map()
 *
 * Ваша задача преобразовать стрим Character в IntStream, т.е. в стрим кодов
 * символов, и получить сумму этих кодов
 *
 * Код символа можно получить так
 *
 * int code = (int) 'a';
 */

public class MapToIntMethod {
    public static long sum(List<Character> characters) {
        int sum = characters.stream()
                .mapToInt(x -> x)
                .sum();
        return sum;
    }
}