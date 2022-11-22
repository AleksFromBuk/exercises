package Fanctionalnterface;

import java.util.function.Function;
import java.util.function.Predicate;

public class Task {
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return (T) -> condition.test(T) ? ifTrue.apply(T) : ifFalse.apply(T);
    }
}
