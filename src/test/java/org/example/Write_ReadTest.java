package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Write_ReadTest {

    @Test
    void readTxt() {
        String t1="orig\\orig.txt";
        String str0 = Write_Read.readTxt(t1);
       assertNotEquals(null,str0);
    }

    @Test
    void writeTxt() {
        String t2="anser_all\\anser_write_test.txt";
        String str1=Write_Read.writeTxt(77.7,t2);
        double Str2=Double.parseDouble(Write_Read.readTxt(t2));
        assertEquals(77.7,Str2);
        System.out.println("如再次测试需要将该文本内容清空");
    }
}