package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1.2. Создание стрима из последовательности. Метод Stream.of()
public class StreamOfMethod {
    public static Stream<Character> createStream() {
        Stream<Character> a = Stream.of('a', 'b', 'c');
        return a;
    }

    public static void main(String[] args) {
        String str = createStream()
                .map(Object::toString)
                .collect(Collectors.joining());
        System.out.println(str);
    }

}