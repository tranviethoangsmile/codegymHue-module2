package com.codegymhueJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzz1() {
        String result = FizzBuzz.fizzBuzz(3);
        String expected = "Fizz";
        assertEquals(expected, result);
    }
    @Test
    void fizzBuzz2() {
        String result = FizzBuzz.fizzBuzz(5);
        String expected = "Buzz";
        assertEquals(expected, result);
    }

    @Test
    void fizzBuzz3() {
        String result = FizzBuzz.fizzBuzz(15);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }


}