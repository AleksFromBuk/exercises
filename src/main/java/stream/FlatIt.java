package stream;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.Iterator;
import java.util.List;

public class FlatIt {

    //  1.0. flatMap для итератора
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        // --------------- решение 1 -----------------------
        //      return Stream.of(it)
        //                .flatMap(s -> iteratorToStream(s))
        //                .flatMap(s -> iteratorToStream(s))
        //                .collect(Collectors.toList());
        // ------------- решение 2 -----------------------
        return iteratorToStream(it).
                flatMap(s -> iteratorToStream(s))
                .collect(Collectors.toList());
    }

    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
                false);
    }
}