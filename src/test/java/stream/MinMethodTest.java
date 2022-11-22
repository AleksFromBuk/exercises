package stream;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MinMethodTest {
    @Test
    public void test1() {
        assertEquals(
                "aa",
                MinMethod.min(List.of("ccc", "bb", "b", "aa"))
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "a",
                MinMethod.min(List.of("ccc", "bb", "b", "a"))
        );
    }
}