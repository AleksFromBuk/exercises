package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] data = s.split(" ");
        for (String str : data) {
            if(words.contains(str)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";
    }

    public static void main(String[] args) {
        String str = "qwe asd zxc rty fgh vbn uio";
        String[] data = str.split(" ");
        for (String it: data) {
            System.out.println(it);
        }
    }
}