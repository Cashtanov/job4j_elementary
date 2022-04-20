package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To3To4Then4() {
        int first = 2;
        int second = 3;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To3To4To5Then5() {
        int first = 2;
        int second = 3;
        int third = 4;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}

