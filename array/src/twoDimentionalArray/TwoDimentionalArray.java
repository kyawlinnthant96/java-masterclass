package twoDimentionalArray;

import java.util.Arrays;
import java.util.Objects;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] array2 = new int[4][4];

        for (int i = 0; i < array2.length; i++) {
            var innnerArray = array2[i];
            for (int j = 0; j < innnerArray.length; j++) {
                // System.out.print(array2[i][j] + " ");
                array2[i][j] = (i * 10) + (j + 1);
            }
            //System.out.println();
        }

//        for ( var outer : array2) {
//            for ( var inner : outer) {
//                System.out.print(inner + " ");
//            }
//            System.out.println();
//        }


        System.out.println(Arrays.deepToString(array2));
        array2[1] = new int[]{10, 12, 14};
        System.out.println(Arrays.deepToString(array2));

        Object[] newArray = new Object[3];
        System.out.println(Arrays.deepToString(newArray));

        newArray[0] = new String[]{"a", "b", "c"};
        System.out.println(Arrays.deepToString(newArray));

        newArray[1] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(newArray));

        newArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(newArray));

        for (Object element : newArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }

    }
}
