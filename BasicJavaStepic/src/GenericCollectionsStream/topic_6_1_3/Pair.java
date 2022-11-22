package GenericCollectionsStream.topic_6_1_3;

public final class Pair <T, K> {
    private final T first;
    private final K second;

    private Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static <T, K> Pair<T, K> of(T first, K second) {
        final Pair<T, K> tkPair = new Pair<>(first, second);
        return tkPair;
    }

    public T getFirst()  {
        return first;
    }

    public K getSecond()  {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair<T, K> that = (Pair<T, K>) o;

        if(first == null && that.first != null
                || first != null && that.first == null) {
            return false;
        }
        if(second == null && that.second != null
                || second != null && that.second == null) {
            return false;
        }
        if(first != null && !first.equals(that.first)) return false;
        if (second != null && !second.equals(that.second)) return false;

        return true;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getFirst(), getSecond());
//    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }



    //    Реализуйте generic-класс Pair, похожий на Optional,
//    но содержащий пару элементов разных типов и не запрещающий
//    элементам принимать значение null.
//    Реализуйте методы getFirst(), getSecond(), equals() и hashCode(),
//    а также статический фабричный метод of(). Конструктор должен быть
//    закрытым (private).
//
//    С корректно реализованным классом Pair должен компилироваться и
//    успешно работать следующий код:
    public static void main(String[] args) throws NoSuchFieldException {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }


}
