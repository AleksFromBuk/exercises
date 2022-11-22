package ru.job4j;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][];
        int commonCount = 0;
        int currsize = 0;
        int j = 0;
        int curs = 0;
        for (int i = 0; i < str.length; i++) {

            if (str[i] != c) {
                curs++;
                continue;
            } else {
                result[j++] = new char[curs];
                commonCount++;
                curs = 0;
            }
        }
        if(curs != 0) {
            result[j++] = new char[curs];
            commonCount++;
            curs = 0;
        }
        int i = 0;
        for(j = 0; j < commonCount; j++) {

            for (; i < str.length; i++) {
                if( str[i] != c) {
                    result[j][curs++] = str[i];
                } else {
                    i++;
                    curs = 0;
                    break;
                }
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
