package stream;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import java.util.List;

import static org.junit.Assert.*;

public class SortedMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("a", "b", "c"),
                SortedMethod.sorted(List.of("c", "b", "a"))
        );
    }
}