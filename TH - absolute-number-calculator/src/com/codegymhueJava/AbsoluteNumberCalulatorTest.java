package com.codegymhueJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalulatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testFindAbsolute0() {

        int number =0;
        int expected = 0;

        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected, result);

    }
    @org.junit.jupiter.api.Test
    void testFindAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFindAbsolute2() {
        int number = 2;
        int expected = 2;
        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testFindAbsolute3 () {
        int number = 3;
        int expected = 3;
        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test

    void testFindAbsolute4() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalulator.findAbsolute(number);
        assertEquals(expected, result);
    }
}