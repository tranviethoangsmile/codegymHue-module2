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
    void getPaySalary() {
        int result = 200;
        Project pro = new Project();
        int newResult = pro.getPaySalary();
        assertEquals(result, newResult);
    }
}