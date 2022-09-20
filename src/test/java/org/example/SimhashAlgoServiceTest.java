package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimhashAlgoServiceTest {

    @Test
    void compare() {
        String t1="aaaa1123456";
        String t2="aaaa122345";
       double sim= Double.parseDouble(SimhashAlgoService.compare(t1,t2));
       assertEquals(0.9922,sim);
       System.out.println("相似度"+sim);
    }

    @Test
    void getDistance() {
        String t3="12345699";
        String t4="14568999";
        int distance=SimhashAlgoService.getDistance(t3,t4);
        assertEquals(5, distance);
        System.out.println("海明距离为"+distance);
    }
}