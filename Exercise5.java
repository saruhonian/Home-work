package ua.od.hillel.HomeWork;

public class Exercise5 {
    public static void main(String[] args) {
        int num0 = 10;
        int num1 = 5;
        int num2 = 8;

        int d = num0 - num1;
        int e = num0 - num2;

        int min = (d > e) ? num2 : num1;
        System.out.println("Nearest number: " + min);

    }
}
