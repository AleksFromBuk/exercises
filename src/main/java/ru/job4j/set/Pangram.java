package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        String sCopyIgnoreCase = s.toLowerCase().replace(" ","");
        Set<Character> data = new HashSet<>();
        for ( int i = 0; i < sCopyIgnoreCase .length(); i++) {
            data.add(sCopyIgnoreCase .charAt(i));
        }
        return data.size() == 26 ? true : false;
    }
}