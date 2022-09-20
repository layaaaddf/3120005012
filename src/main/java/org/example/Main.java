package org.example;
import  org.example.SimhashAlgoService;
import  org.example.Write_Read;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimhashAlgoService simhashAlgoService = new SimhashAlgoService();
        String  []arr=new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原文的路径");
        arr[0] = sc.next();
        System.out.println("请输入抄袭文章的路径");
        arr[1] = sc.next();
        System.out.println("请输入答案存放的路径");
        arr[2] = sc.next();
        String str0 = Write_Read.readTxt(arr[0]);
        String str1 = Write_Read.readTxt(arr[1]);
        String resultFileName = arr[2];
        String similarity = SimhashAlgoService.compare(arr[0],arr[1]);
        // 把相似度写入最后的结果文件中
        Write_Read.writeTxt(Double.parseDouble(similarity)*100, resultFileName);
        System.out.println("相似度为"+Double.parseDouble(similarity)*100+"%");
        // 退出程序
        System.exit(0);
    }
}
