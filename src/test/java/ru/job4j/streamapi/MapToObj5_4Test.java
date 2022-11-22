package ru.job4j.streamapi;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MapToObj5_4Test {
    @Test
    public void test() {
        String input = "123";
        List<Character> expect = List.of('1', '2', '3');
        assertEquals(expect, MapToObj5_4.symbols(input));
    }
}