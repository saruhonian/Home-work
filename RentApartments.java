package ua.od.hillel.HomeWork;

public class RentApartments {
    public static void main(String[] args) {
        int days = 6;

        int total = days * 40;

        if (days > 7)
            total -= 50;
        {

            if (days > 4 & days <= 7)
                total -= 20;
        }
        System.out.println("Payment: " + total + "$");
    }
}
