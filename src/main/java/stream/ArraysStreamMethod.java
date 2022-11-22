package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {

    // 1.3. Создание стрима из массива. Метод Arrays.stream()
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}