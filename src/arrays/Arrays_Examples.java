package arrays;

import java.util.Arrays;

public class Arrays_Examples {

    public static void main(String[] args) {
        //1. Declare array
        int[] oneDimArr = {1, 2, 3};
        System.out.println(oneDimArr.length + "\n");
        
        //Access to array Length (row & col length)
        //IMPORTANT: Multidimensional arrays in Java, are kind of mix between "Jagged Arrays" and "Multidimensional Аrrays" in C#.
        int[][] multiDimJaggedArr = {
            {22, 21, 55, 45},
            {45, 878, 56, 77, 5453, 23, 1, 54},
            {11, 22, 3}
        };
        System.out.println("\nArray length..");
        System.out.println("Rows: " + multiDimJaggedArr.length);
        System.out.println("Cols: " + multiDimJaggedArr[0].length);
        System.out.println("Cols: " + multiDimJaggedArr[1].length);
        System.out.println("Cols: " + multiDimJaggedArr[2].length + "\n");

        //print arrays
        //with for-each
        for (int[] integers : multiDimJaggedArr) {
            System.out.println(Arrays.toString(integers));
        }
        //with method "Arrays.deepToString()" <-to print "Multidimensional Аrrays"
        System.out.println("\n" + Arrays.deepToString(multiDimJaggedArr) + "\n");
        //wirh method "Arrays.toString()" <-to print normal "Array"
        String[] arrayOfStrings = {"one", "two", "three", "four"};
        System.out.println(Arrays.toString(arrayOfStrings));

        //Copyng two arrays
        int[] arr4 = Arrays.copyOf(oneDimArr, oneDimArr.length);
        System.out.println("\n" + Arrays.toString(arr4) + "\n");
    }

}
