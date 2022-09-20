package org.example;

import org.junit.Test;

import static org.example.SimhashAlgoService.compare;
 public class MainTest {




    @Test
    public void test_add() {

        String orig = "orig\\orig.txt";
        String a1 ="plagiarism\\orig_0.8_add.txt";
        String str0 = Write_Read.readTxt(orig);
        String str1 = Write_Read.readTxt(a1);
        String resultFileName = "anser_all\\anser_main_test.txt";
        String similarity = compare(str0,str1);
        Write_Read.writeTxt(Double.parseDouble(similarity)*100, resultFileName);
        System.out.println("相似度为"+Double.parseDouble(similarity)*100+"%");

        }



    @Test
    public void test_same() {

        String orig = "orig\\orig.txt";
        String str0 = Write_Read.readTxt(orig);
        String str1 = Write_Read.readTxt(orig);
        String resultFileName = "anser_all\\anser_main_test.txt";
        String similarity = compare(str0,str1);
        Write_Read.writeTxt(Double.parseDouble(similarity)*100, resultFileName);
        System.out.println("相似度为"+Double.parseDouble(similarity)*100+"%");
    }
    }


