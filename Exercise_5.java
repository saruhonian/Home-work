package ua.od.hillel.first;


public class Exercise_5 {
    public static void main(String[] args) {

        int sum = 0;
        int[] array = {5, 7, 25, 15, 40, 2, 8, 55, 10};

        for (int x = 0; x < 4; x++) {
            sum += array[x];
         }
        System.out.println(sum);

    }
}
