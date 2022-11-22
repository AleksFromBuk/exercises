package testforsomeneeds;


import org.junit.Test;
import ru.job4j.Split;

import static org.junit.Assert.assertArrayEquals;

public class testSplit {


        @Test
        public void test() {
            assertArrayEquals(new String[] {"one", "two"}, convert(Split.split("one two".toCharArray(), ' ')));
            assertArrayEquals(new String[] {"one", "two", "three"}, convert(Split.split("one two three".toCharArray(), ' ')));
            assertArrayEquals(new String[] {"onetwothree"}, convert(Split.split("onetwothree".toCharArray(), ' ')));
        }

        private String[] convert(char[][] splitted) {
            String[] result = new String[splitted.length];
            int ri = 0;
            for (char[] row : splitted) {
                result[ri++] = new String(row);
            }
            return result;
        }
}

