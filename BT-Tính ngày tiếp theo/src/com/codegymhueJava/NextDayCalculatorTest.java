package com.codegymhueJava;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void namNhuan() {
       boolean namNhuan = NextDayCalculator.namNhuan(2020);
       boolean expected = true;
       assertEquals(expected,namNhuan);



    }

    @org.junit.jupiter.api.Test
    void dayInMonth() {
        int dayInMonth = NextDayCalculator.ngaytrongthang(2,2020);
        int expected = 29;
        assertEquals(expected,dayInMonth);
    }

    @org.junit.jupiter.api.Test
    void ngayTiepTheo() {
        String ngayTiepTheo = NextDayCalculator.ngayTiepTheo(30,12,2021);
        String expected = "31/12/2021";
        assertEquals(expected,ngayTiepTheo);
    }
}