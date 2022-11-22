package GenericCollectionsStream.task_6_2_5;

import java.util.*;

public class symmetricDifference {

    //Симметрическая разность множеств {1, 2, 3} и {0, 1, 2} равна {0, 3}.
    public static <T> Set<T>
    symmetricDiff(Set<? extends T> set1, Set<? extends T> set2) {
        //Почему  не работает с TreeSet ?
        //Все элементы, вставленные в TreeSet должны реализовать интерфейс Comparable. Кроме того, все эти элементы должны быть взаимно сопоставимыми т.е. e1.compareTo(e2) не должен бросать ClassCastException для любых элементов e1 и e2 в множестве.
        //
        //Если вы попытаетесь выполнить
        //Set<Object> set = new TreeSet<>();
        //set.add(new Object());
        //То получите:
        //Exception in thread "main" java.lang.ClassCastException: java.lang.Object cannot be cast to java.lang.Comparable
        //
        //А то что элементы являются сравнимыми, в задании не гарантируется.
        Set<T> ans = new HashSet<>();
        for(T it : set1) {
            if(!set2.contains(it)) {
                ans.add(it);
            }
        }
        for(T it : set2) {
            if(!set1.contains(it)) {
                ans.add(it);
            }
        }
        return  ans;
    }

    public static void main(String[] args) {
        Set<Integer> num1 = new HashSet<>(Arrays.asList(3, 7, 9));

//        num1.add(3);
//        num1.add(7);
//        num1.add(9);

        HashSet<Integer> num2 = new HashSet<>(Arrays.asList(5, 7, 12));
//        num2.add(5);
//        num2.add(7);
//        num2.add(12);

        Set<Integer> result = symmetricDiff(num1,num2);
        System.out.println(result);
    }

}
