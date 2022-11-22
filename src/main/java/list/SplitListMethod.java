package list;

import com.google.common.collect.Iterables;

import java.util.ArrayList;
import java.util.List;

public class SplitListMethod {
    // Общий метод для разделения списка на подсписки размером `n` каждый
// в Java с использованием Guava (в окончательном списке может быть меньше элементов)
    public static<T> List[] partition(List<T> list, int n)
    {
        // Подсчитаем общее количество разделов размером `n` каждый
        int m = list.size() / n;
        if (list.size() % n != 0) {
            m++;
        }

        // разбиваем список на подсписки размером `n` каждый и получаем итератор
        Iterable <List<T>> itr = Iterables.partition(list, n);

        // создать `m` пустых списков
        List<T>[] partition = new ArrayList[m];
        int i = 0;
        for (List<T> el : itr) {
            partition[i++] = new ArrayList(el);
        }

        // возвращаем списки
        return partition;
    }

    public static void main(String[] args) {
        int n = 129;
        byte c = (byte)n;
        int m = 258;
        byte d = (byte)m;
        System.out.println(c);
        System.out.println(d);

        List<Integer>data = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            data.add(i, i+1);
        }

        for(int i = 0; i < 1000; i++) {
           System.out.println(data.get(i));
        }

        int size = 100;
        List<List<Integer>> mt = List.of(partition(data, size));
        for (List<Integer>  i : mt) {
            for (Integer j : i) {
                System.out.println(j);
            }
            System.out.println("------------------------------------------");

        }
    }
}
