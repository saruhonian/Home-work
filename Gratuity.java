package ua.od.hillel.first;


import java.util.Scanner;

public class Gratuity {
    public static void main(String[] args) {
        int gratuity = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("level of service: ");
        String service = scanner.next();

        System.out.println("Enter sum: ");
        int sum = scanner.nextInt();
        scanner.close();

        switch (service) {
            case "terrible":
                System.out.println("Terrible servise. Total sum: " + sum + "$");
                break;
            case "poor":
                System.out.println("Poor servise. Total sum: " + (sum * 1.05) + "$");
                break;
            case "good":
                System.out.println("Good servise. Total sum: " + (sum * 1.1) + "$");
                break;
            case "great":
                System.out.println("Great servise. Total sum: " + (sum * 1.15) + "$");
                break;
            case "excellent":
                System.out.println("Exellent servise. Total sum: " + (sum * 1.2) + "$");
                break;

        }

    }

}
