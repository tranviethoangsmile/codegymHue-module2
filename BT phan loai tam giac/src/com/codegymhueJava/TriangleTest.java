package com.codegymhueJava;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void phanLoaiTamGiac() {

        String check = Triangle.PhanLoaiTamGiac(2,2,3);
        String expected = "tamgiaccan";
        assertEquals(check, expected);

    }
}