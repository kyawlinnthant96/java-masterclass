package reverseArray;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] unsortedArray = getRamdomArray(5);
        System.out.println(Arrays.toString(unsortedArray));

        int[] sortedArray = sortedInteger(new int[] {4,3,7,5,6});
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getRamdomArray(int len) {

        Random rand = new Random();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = rand.nextInt(1000);
        }
        return array;
    }

    private static int[] sortedInteger(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---->"+Arrays.toString(sortedArray));
                }
            }
                    System.out.println("---->"+Arrays.toString(sortedArray));

        }
        return sortedArray;
    }

}
