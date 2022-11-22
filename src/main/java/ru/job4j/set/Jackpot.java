package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Jackpot {

    public static boolean checkYourWin(String[] combination) {
        Set<String> symbols = new HashSet<>();
        for (String str : combination) {
            symbols.add(str);
        }
        return symbols.size() == 1;
    }
}
