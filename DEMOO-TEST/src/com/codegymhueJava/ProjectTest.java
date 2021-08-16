package com.codegymhueJava;

import static org.junit.jupiter.api.Assertions.*;

class ProjectTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {

    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        int expectedResult = 800000;
        Project proj = new Project();
        int result = proj.getSalary();
        assertEquals(expectedResult, result);
    }
}