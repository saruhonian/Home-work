package ua.od.hillel.first;
//3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….

public class Exercise_3 {
    public static void main(String[] args) {
        for (int num = 90; num >= 0; num = num - 5) {
            System.out.println(num);
        }
    }
}
