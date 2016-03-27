package ua.od.hillel.HomeWork;

public class Exercise1 {
    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 28;
        int num3 = 23;

        if (num1 < num2 && num1 < num3) {
                System.out.println("minimum is num1: " + num1);
            } else if (num2 < num3 && num2 < num1) {
                System.out.println("minimum is num2: " + num2);
        } else if (num3 < num1 && num3 < num2){
            System.out.println("minimum is num3: " + num3);
        }

    }

}



