package stream;

import java.util.Collection;
import java.util.stream.Stream;

public class StreamMethod {
    // 1.1. Создание стрима. Метод stream()
    public static Stream<Integer> createStream(Collection<Integer> data) {
//        Stream<Integer> stream = data.stream();
//        return stream;

        return data.stream();
    }
}