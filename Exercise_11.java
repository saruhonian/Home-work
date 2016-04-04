package ua.od.hillel.first;

// Нахождение n! когда n = 5
public class Exercise_11 {
    public static void main(String[] args) {
        int n = 5;
        int b = 1;
        int result = 1;
        while (b <= n) {
            result = (result * b);
            b++;
        }
        {
            System.out.println(result);
        }
    }
}
