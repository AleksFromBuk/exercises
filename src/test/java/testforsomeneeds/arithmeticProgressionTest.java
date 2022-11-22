package test;

import list.arithmeticProgression;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class arithmeticProgressionTest {
    @Test
    public void checkDataIsNotNull() {
        List<Integer> data = List.of(
                1, 6, 11, 16, 21,
                26, 31, 36, 41, 46
        );
        int rsl = arithmeticProgression.checkData(data);
        assertThat(rsl, is(235));
    }

    @Test
    public void checkDataIsNull() {
        List<Integer> data = List.of(
                1, 6, 11, 15, 21,
                26, 31, 36, 41, 46
        );
        int rsl = arithmeticProgression.checkData(data);
        assertThat(rsl, is(0));
    }
}


