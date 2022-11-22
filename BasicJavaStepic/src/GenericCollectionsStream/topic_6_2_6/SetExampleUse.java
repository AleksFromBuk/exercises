package GenericCollectionsStream.topic_6_2_6;

import java.util.*;

public class SetExampleUse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aabb");
        list.add("aaa");
        list.add("bbbb");
        list.add("aac");

        //Set<String> set = new LinkedHashSet<>(list);
        boolean test;
        SortedSet<String> set = new TreeSet<>(list);
        for (String it : list) {
            test = set.add(it);
            System.out.println(test);
        }
        List<String> out = new ArrayList<>(set);
        for (String it : out) {
            System.out.println(it);
        }

        System.out.println();
        set.headSet("aac").clear();
        set.forEach(System.out::println);

        //---- пример применени коллекции для удаления дубликатов ----
        //---- с учетом исходного порядка следования элементов -----
        List<String> data = new ArrayList<>();
        data.add("aaaa");
        data.add("aaa");
        data.add("bbb");
        data.add("aaa");
        data.add("bbb");
        data.add("aaaa");

        Set<String> inf =
                new LinkedHashSet<>(data);

        List<String> dataWithOutCopies =
                new ArrayList<>(inf);

        System.out.println();
        for(String it: dataWithOutCopies) {
            System.out.println(it);
        }
    }
}
