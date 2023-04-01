package HomeWorkTasks.JavaIntern;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//1) Дано четное число N (>0) и символы c1 и c2.
//  Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
public class Task2 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();

        Scanner str = new Scanner(System.in);
        System.out.println("Введите 1й символ: ");
        String firstWord = str.next();

        Scanner strg = new Scanner(System.in);
        System.out.println("Введите 2й символ: ");
        String secondWord = strg.next();


        System.out.println(printMethod(number,firstWord,secondWord));
        File file = new File("HomeWork.txt");
        try {
            FileWriter writer = new FileWriter("HomeWork.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write((printMethod(number,firstWord,secondWord)));
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
}
    private static String printMethod (int num, String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < num / 2; count++) {
            sb.append(word1).append(word2);



        }
        String result = String.valueOf(sb);
        return result;
    }
}
