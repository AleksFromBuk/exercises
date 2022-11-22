package ru.job4j.streamapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

class UserMapTest {

    @Test
    public void test() {
        List<Integer> ages = List.of(1, 2);
        List<UserMap.User> result = UserMap.map(ages);
        Iterator<UserMap.User> iterator = result.iterator();
        Assertions.assertEquals(1, iterator.next().getAge());
        assertEquals(2, iterator.next().getAge());
    }
}