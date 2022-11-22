package stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.Assert.*;

public class SortedWithComparatorTest {
    @Test
    public void test() {
        assertEquals(
                List.of("c", "b", "a"),
                SortedWithComparator.sorted(List.of("a", "b", "c"))
        );
    }
}