package ua.od.hillel.HomeWork;

public class Max_Min {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 28;
        int num3 = 23;

        int min = (num1 < num2 & num1 < num3) ? num1 : (num2 < num3) ? num2 : num3;
        System.out.println(min);

        int max = (num1 > num2 & num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;
        System.out.println(max);

    }
}
