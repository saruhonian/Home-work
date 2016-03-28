package ua.od.hillel.HomeWork;

public class Exercise3 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 23;
        int num3 = 23;

        int min = (num1 < num2 & num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;

        if (min == num1) System.out.println("Min is: " + num1);
        if (min == num2) System.out.println("Min is: " + num2);
        if (min == num3) System.out.println("Min is: " + num3);

        }
}
