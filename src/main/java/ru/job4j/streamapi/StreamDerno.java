package ru.job4j.streamapi;

import java.util.ArrayList;

public class StreamDerno {

    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        double productOfSqrRoots = myList.parallelStream()
                .reduce(1.0,
                        (a, b) -> a * Math.sqrt(b),
                        (a,b) -> a * b);
        System.out.println("Произведение квадратных корней из элементов"
        + " списка равно " + productOfSqrRoots);

        double productOfSqrRoots2 = myList.parallelStream()
                .reduce(1.0,
                        (a, b) -> a * Math.sqrt(b));
        System.out.println("Произведение квадратных корней из элементов"
                + " списка равно " + productOfSqrRoots2);
    }
}
