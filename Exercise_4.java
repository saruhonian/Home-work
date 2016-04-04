package ua.od.hillel.first;
//4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

import java.lang.Math;

public class Exercise_4 {
    public static void main(String[] args) {

        for ( int num = 1; num <= 20; num++)
        {
            System.out.println(Math.pow(2, num));
        }
    }
}
