package ru.job4j.loop;

public class Task14 {
    public static void loop(int a, int b) {
        String tmp = "Start" + System.lineSeparator();
        for (int i = a; i < b; i++) {
            if(i >= 10 && i < Math.min(99, b)) {
                if( i == Math.max(a, 10))
                    tmp += i;
                else
                    tmp += " " + i;
            }
        }
        tmp += System.lineSeparator() + "Finish" + System.lineSeparator();
        System.out.print(tmp);
    }
}
