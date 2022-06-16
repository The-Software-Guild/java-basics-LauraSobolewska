package SummativeSums;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] array) {
        // write your code here
        int[] list1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] list2 = {999, -60, -77, 14, 160, 301};
        int[] list3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99};
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        //int size = list1.nextInt();

        sum1 = IntStream.of(list1).sum();
        sum2 = IntStream.of(list2).sum();
        sum3 = IntStream.of(list3).sum();

            System.out.println("Array sum: " + sum1);
            System.out.println("Array sum 2: " + sum2);
            System.out.println("Array sum 3: " + sum3);
        }
    }
