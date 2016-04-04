package ua.od.hillel.first;


public class Exercise_6 {
    public static void main(String[] args) {


        int[] array = {5, 7, 25, 15, 40, 2, 8, 55, 10};
        int min = array[0];
        int max = array[0];

        for (int x = 0; x < 9; x++) {
            if (min < array[x]);
            else
            min = array[x];
            if (max > array[x]);
            else
                max = array[x];

        }
        System.out.println(min);
        System.out.println(max);

    }
}
