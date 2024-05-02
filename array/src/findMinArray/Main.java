package findMinArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        int returnedMin  = findMin(returnedArray);
//        System.out.println("min = " + returnedMin);

        reverse(returnedArray);
        System.out.println("Finale" + Arrays.toString(returnedArray));

    }

    public static int[] readIntegers() {
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       String[] splits = input.split(",");
       int[] values = new int[splits.length];
       for (int i = 0; i < splits.length; i++) {
           values[i] = Integer.parseInt(splits[i].trim());
       }
       return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) {
            if (el < min) {
                min = el;
            }
        }
        return min;
    }

    private static void reverse(int[] array) {
        int max = array.length - 1; // 4 -1 = 3
        int mid = array.length / 2; // 4 / 2 = 2

        for (int i = 0; i < mid; i++) { // 0 < 2; 0++
            int temp = array[i]; // temp = 12
            array[i] = array[max - i]; // 12 =[ 3 - 0 = 2 ] = 66
            array[max - i] = temp; // [3 - 1 = 2 ] = 12
            System.out.println("--->" + Arrays.toString(array)); // [66,45,23,12]
        }
    }
}
