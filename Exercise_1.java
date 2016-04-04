package ua.od.hillel.first;
// 1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
public class Exercise_1 {
    public static void main(String[] args) {

        for (int num = 1000; num <= 9999; num = num + 3)
        {
            System.out.println(num);
        }

    }
}
