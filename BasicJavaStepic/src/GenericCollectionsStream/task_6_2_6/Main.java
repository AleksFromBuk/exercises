package GenericCollectionsStream.task_6_2_6;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        List<Integer> data = new ArrayList<>();
//        int i = 0;
//        while(scan.hasNextInt()) {
//            if(i % 2 == 1) {
//                data.add(scan.nextInt());
//            } else
//                scan.nextInt();
//            i++;
//        }
//        Collections.reverse(data);
//        for(Integer it: data) {
//            System.out.print(it + " ");
//        }
//    }
//
//}
// --------------------------- другие решения ------------------------------------
//                                     №1
//Дословно согласно заданию. Итераторы удобны для удаления объектов из списка.
// Для повышения читабельности всё разделено по методам согласно логике исполнения.
//import java.io.IOException;
//        import java.util.*;
//
//public class Main {
//    private static void readNumbers(LinkedList<Integer> numbers) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            numbers.add(scanner.nextInt());
//        }
//    }
//
//    private static void removeOddNumbers(LinkedList<Integer> numbers) {
//        for (ListIterator<Integer> iter = numbers.listIterator(numbers.size()); iter.hasPrevious();) {
//            iter.previous();
//            if (iter.previousIndex() % 2 != 0) {
//                iter.remove();
//            }
//        }
//    }
//
//    private static void printNumbers(LinkedList<Integer> numbers) {
//        for (Iterator<Integer> iter = numbers.iterator(); iter.hasNext();) {
//            Integer n = iter.next();
//            System.out.print(n);
//            if (iter.hasNext()) {
//                System.out.print(" ");
//            }
//        }
//    }
//
//    public static void main(String[] args) throws Exception {
//        LinkedList<Integer> numbers = new LinkedList<>();
//        readNumbers(numbers);
//        removeOddNumbers(numbers);
//        Collections.reverse(numbers);
//        printNumbers(numbers);
//        System.out.flush();
//    }
//}
//-------------------- №2 с использованием cтруктуры Deq ----------------

public class Main {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            scanner.nextInt();
            if(scanner.hasNext()) deque.addFirst(scanner.nextInt());
        }

        for (int i: deque) System.out.printf("%s ", i);
    }
}