package ua.od.hillel.first;


public class Exercise_7 {
    public static void main(String[] args) {
        int sum_even = 0;
        int  sum_not_even = 0;
        int[] array = {5, 7, 25, 15, 40, 2, 8, 55, 10};

        for (int x = 0; x < 9; x++) {
            if (array[x] % 2 == 0) {
                sum_even += array[x];
                }
             else
               sum_not_even += array[x];
            }

        System.out.println(sum_even);
        System.out.println(sum_not_even);
        }



    }


