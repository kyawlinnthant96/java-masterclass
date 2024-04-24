import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String... args) {
        System.out.println("Quick Brown Fox");

//        int[] arr;
//        arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr.length - i;
//            System.out.print(arr[i]);
//        }
//
//        for (int element : arr) {
//            System.out.print(element + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

       /* int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));*/

       /* String[] sArray = {"Able","Mark", "John","Lucy", "Alexia"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Able") >= 0) {
            System.out.println("Able was found");
        }

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {1,2,3,4,6};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }*/

        /*int[] newArray = getRandomArray(10);
        System.out.println(Arrays.toString(newArray));

        int[] sortedArray = sortIntegers(new int[] {1,14,21});
        System.out.println(Arrays.toString(sortedArray));*/
        String[] splitString = "Quick Brown Fox".split(" ");
        printText(splitString);
    }

    public static void printText(String[] textLists) {
        for (String text : textLists) {
            System.out.println(text);
        }
    }

    public static int[] getRandomArray(int len){
        Random rand = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

    public static int[] sortIntegers(int[] arr){
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("---> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("---> " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
