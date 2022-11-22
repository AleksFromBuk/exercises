package stream.Optional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * В Optional есть метод, который иногда полезен.
 * Это метод filter(), он возвращает Optional из значения,
 * если значение удовлетворяет условию, в противном случае пустой Optional.
 * Например,
 * Optional.of(1).filter(n -> n > 0); // Вернется Optional из 1
 * Optional.of(-1).filter(n -> n > 0); // Вернется пустой Optional
 */

public class OptionalFilter {

    public static class Worker {

        private String passport;

        private List<Child> children = new LinkedList<>();

        public Worker(String passport, List<Child> children) {
            this.passport = passport;
            this.children = children;
        }

        public String getPassport() {
            return passport;
        }

        public List<Child> getChildren() {
            return children;
        }
    }

    public static class Child {

        private String name;

        private int age;

        public Child(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public static List<Child> defineChildren(List<Worker> workers, String passport) {
       return findByPassport(workers, passport)
                //.stream()
               .filter(w -> w.getChildren().size() > 2)
               .stream()
               .flatMap(s -> s.getChildren().stream())
               .filter(ch -> ch.getAge() < 15)
               .collect(Collectors.toList());
    }

    public static Optional<Worker> findByPassport(List<Worker> workers, String passport) {
        return workers.stream()
                .filter(w -> w.getPassport().equals(passport))
                .findFirst();
    }

}