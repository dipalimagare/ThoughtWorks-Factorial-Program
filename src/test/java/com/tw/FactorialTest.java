package com.tw;

import org.junit.jupiter.api.*;

public class FactorialTest {
    @Test
    public void factorialZero() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialOne() {
        Factorial f = new Factorial();
        int expected = 1;
        int actual = f.fact(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialTwo() {
        Factorial f = new Factorial();
        int expected = 2;
        int actual = f.fact(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void factorialFive() {
        Factorial f = new Factorial();
        int expected = 720;
        int actual = f.fact(6);
        Assertions.assertEquals(expected, actual);
    }
}
