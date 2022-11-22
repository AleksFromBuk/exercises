package GenericCollectionsStream;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        Optional<String> obOpt = Optional.empty();
        obOpt.ifPresent(System.out::println);
    }
}
