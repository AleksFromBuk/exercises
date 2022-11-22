package ru.job4j.set.Test;

import org.junit.Test;
import ru.job4j.set.Isogram;
import ru.job4j.set.UniqueName;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static ru.job4j.set.UniqueName.User;

public class UniqueNameTest {
    @Test
    public void collectUniqueName() {
        List<User> users = List.of(
                new User(1, "name1"),
                new User(2, "name2"),
                new User(3, "name1"),
                new User(4, "name3"),
                new User(5, "name5"),
                new User(6, "name3")
        );
        int rsl = UniqueName.collectUniqueName(users);
        int expected = 4;
        assertThat(rsl, is(expected));
    }

    public static class IsogramTest {
        @Test
        public void checkStringTrue() {
            String s = "uncopyrightables";
            boolean b = Isogram.checkString(s);
            assertThat(b, is(true));
        }

        @Test
        public void checkStringFalse() {
            String s = "javascript";
            boolean b = Isogram.checkString(s);
            assertThat(b, is(false));
        }
    }
}