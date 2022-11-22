package ru.job4j.set.Test;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.set.Pangram;

import static org.hamcrest.core.Is.is;

public class PangramTest {
    @Test
    public void checkString() {
        String str = "Jackdaws love my big sphinx of quartz";
        boolean b = Pangram.checkString(str);
        Assert.assertThat(b, is(true));
    }
}