package ru.job4j.arrays.Test;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.arrays.PushTheNumbers.push;

public class PushTheNumbersTest {

    @Test
    public void testWithArray5To5() {
        int [][] array = {
                {62, 12, 86, 96, 2},
                {78, 98, 10, 45, 86},
                {82, 59, 47, 88, 79},
                {99, 10, 91, 73, 88},
                {32, 48, 8, 87, 55 }
        };
        push(array, 2, 2);
        int[][] expected = {
                {62, 12, 10, 96, 2},
                {78, 98, 47, 45, 86},
                {59, 47, 0, 47, 88},
                {99, 10 ,47, 73, 88},
                {32, 48 ,91, 87, 55}
        };
        assertThat(array, is(expected));
    }

    @Test
    public void testWithArray4To4() {
        int [][] array = {
                {29, 29, 48, 92},
                {90, 58, 7, 57},
                {87, 36, 21, 19},
                {93, 55, 60, 89}
        };
        push(array, 3, 1);
        int[][] expected = {
                {29, 58, 48, 92},
                {90, 36, 7, 57},
                {87, 55, 21, 19},
                {55, 0, 55, 60}
        };
        assertThat(array, is(expected));
    }
}