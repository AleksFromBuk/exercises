package stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI6_4 {
    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> data = stream
                .sorted(order)
                .collect(Collectors.toList());
        if (data.size() != 0) {
            minMaxConsumer.accept(data.get(0), data.get(data.size()-1));
        } else {
            minMaxConsumer.accept(null, null);
        }
    }

    public static void main(String[] args) {
        findMinMax(
                Stream.of(9, 6, 8, 3, 19, 16, 18, 13),
                Integer::compareTo,
                (v1, v2) -> System.out.println("max = " + v2 + "\nmin = " + v1)
        );
    }

    //---------------------- Другие решения --------------------------
    /**
     *
     *                               №1
     *  решение с использованием фич Java 12:
     *
     *  "если с java 12 есть метод teeing и в классе Collectors есть методы minBy и maxBy."
     *
     * public static <T> void findMinMax(
     *         Stream<? extends T> stream,
     *         Comparator<? super T> order,
     *         BiConsumer<? super T, ? super T> minMaxConsumer) {
     *
     *     stream.collect(Collectors.teeing(Collectors.minBy(order),
     *     Collectors.maxBy(order), (min, max) -> {
     *
     *         minMaxConsumer.accept(min.orElse(null), max.orElse(null));
     *         return null;
     *     }));
     * }
     */

    /**
     *                             №2
     * Алексей Владыкин(препод!)
     * 6 лет назад
     * У стрима есть методы min() и max(), но воспользоваться
     * ими «в лоб» нельзя, т.к. оба являются терминальными операциями.
     * Использовав одну из них, вторую уже вызвать нельзя — стрим бросит
     * IllegalStateException. Некоторые обходили это ограничение, собирая
     * элементы стрима в коллекцию, из которой можно было получить новый
     * стрим столько раз, сколько нужно. Это решение проходит тесты, но
     * его большой недостаток — необходимость хранить в памяти все элементы
     * стрима, которых может быть очень много. Мы заранее не знаем, сколько их будет.
     *
     * Оптимальным решением является нахождение минимума и максимума за
     * один проход по стриму без использования промежуточного хранилища элементов.
     *
     * Обратите внимание, что решение не использует приведение типа к (T).
     * Благодаря этому отсутствуют предупреждения компилятора о небезопасном
     * приведении типов. В других решениях, где Consumer реализован как
     * лямбда-выражение или как анонимный класс, избежать предупреждений
     * было бы гораздо сложнее.
     *
     * P.S. В лекциях были рассмотрены только последовательные стримы,
     * однако в Java бывают еще и параллельные стримы, обрабатывающие
     * свои элементы одновременно в нескольких потоках. Это решение для
     * параллельных стримов не подходит. Но это уже совсем другая история...
     */

    /**
     * public static <T> void findMinMax(
     *         Stream<? extends T> stream,
     *         Comparator<? super T> order,
     *         BiConsumer<? super T, ? super T> minMaxConsumer) {
     *
     *     MinMaxFinder<T> minMaxFinder = new MinMaxFinder<>(order);
     *     stream.forEach(minMaxFinder);
     *     minMaxConsumer.accept(minMaxFinder.min, minMaxFinder.max);
     * }
     *
     *
     * private static class MinMaxFinder<T> implements Consumer<T> {
     *
     *     private final Comparator<? super T> order;
     *     T min;
     *     T max;
     *
     *     private MinMaxFinder(Comparator<? super T> order) {
     *         this.order = order;
     *     }
     *
     *     @Override
     *     public void accept(T t) {
     *         if (min == null || order.compare(t, min) < 0) {
     *             min = t;
     *         }
     *         if (max == null || order.compare(max, t) < 0) {
     *             max = t;
     *         }
     *     }
     * }
     */

    /**
     *                                  №3
     * public static <T> void findMinMax(
     *         Stream<? extends T> stream,
     *         Comparator<? super T> order,
     *         BiConsumer<? super T, ? super T> minMaxConsumer) {
     *
     *     T max = null;
     *     T min = null;
     *     Iterator<? extends T> iter = stream.iterator();
     *     while(iter.hasNext()) {
     *         T val = iter.next();
     *         if(max==null || order.compare(max, val) < 0) {
     *             max = val;
     *         }
     *         if(min==null || order.compare(min, val) > 0) {
     *             min = val;
     *         }
     *     }
     *     minMaxConsumer.accept(min, max);
     * }
     */

    /**
     *                 комментарий к решению №3
     * Попробовал решение с Iterator и Array  с входным стримом
     * и из 4_000_000_000 элементов. Входной стрим как в решении
     * предыдущего шага только Integer.  Решение с Iterator сработало
     * а решение с Array кинуло исключение java.lang.OutOfMemoryError: Java heap space
     */
}
