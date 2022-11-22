package ru.job4j.streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class ArbitraryCollector {
    // сюда сложим элементы
    Supplier<List<Integer>> supplier = LinkedList::new;
    // говорим, как добавлять элементы
    BiConsumer<List<Integer>, Integer> consumer = List::add;
    // не вдаемся в подробности. Просто нужно
    BinaryOperator<List<Integer>> merger = (xs, ys) -> {
        xs.addAll(ys);
        return xs;
    };
    // это функция, которая обработает наш список после сборки
// здесь вся логика
    Function<List<Integer>, Integer> functionDiv = (ns) -> {
        int number = 100;
        for (Integer n : ns) {
            number /= n;
        }
        return number;
    };

    Function<List<Integer>, Integer> functionMult = (ns) -> {
        var number = 1;
        for (Integer n : ns) {
            number *= n;
        }
        return number;
    };

    public static void main(String[] args) {
        ArbitraryCollector obj = new ArbitraryCollector();
        Integer result = List.of(4, 5).stream()
                .collect(Collector.of(obj.supplier, obj.consumer,
                        obj.merger, obj.functionDiv));
        System.out.println(result);
    }

}
