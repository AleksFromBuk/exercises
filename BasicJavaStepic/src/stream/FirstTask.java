package stream;

import java.util.stream.IntStream;

public class FirstTask {
    /**
     * Напишите метод, возвращающий стрим псевдослучайных целых чисел.
     * Алгоритм генерации чисел следующий:
     *
     * Берется какое-то начальное неотрицательное число (оно будет передаваться
     * в ваш метод проверяющей системой).
     * Первый элемент последовательности устанавливается равным этому числу.
     * Следующие элементы вычисляются по рекуррентной формуле
     * R_{n+1}=mid(R_{n}^2), где mid — это функция, выделяющая второй,
     * третий и четвертый разряд переданного числа.
     * Например, mid(123456) = 345
     * Пример     *
     * pseudoRandomStream(13) должен вернуть стрим, состоящий из следующих чисел:
     *
     * 13, 16, 25, 62, 384, 745, 502, 200, 0, ... (дальше бесконечное количество нулей)
     */

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream
                .iterate(seed, n -> (n*n)/10%1000);
    }

    public static int get(int num) {
//        num /= 10;
//        int tmp = 0;
//        for (int i = 0; i < 3 && num > 0; i++) {
//            tmp += (num % 10) * Math.pow(10, i);
//            num /= 10;
//        }
//        return tmp;
        return (num*num)/10 % 1000;
    }

    public static void main(String[] args) {
        System.out.println(new FirstTask().get(16));
    }
}
