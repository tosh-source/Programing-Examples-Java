package arrays;

import java.util.Arrays;

public class Arrays_Examples {

    public static String nLine = System.lineSeparator();

    public static void main(String[] args) {
        //1. Declare array
        int[] oneDimArr = {1, 2, 3};
        System.out.printf("Arr length: %s", oneDimArr.length + nLine);
        
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
        System.out.println("Cols: " + multiDimJaggedArr[2].length + nLine);

        //print arrays
        //with for-each
        for (int[] integers : multiDimJaggedArr) {
            System.out.println(Arrays.toString(integers));
        }
        //with method "Arrays.deepToString()" <-to print "Multidimensional Аrrays"
        System.out.println("\n" + Arrays.deepToString(multiDimJaggedArr) + nLine);
        //wirh method "Arrays.toString()" <-to print normal "Array"
        String[] arrayOfStrings = {"one", "two", "three", "four"};
        System.out.println(Arrays.toString(arrayOfStrings));

        //Copyng two arrays
        int[] copyOfOneDimArr = Arrays.copyOf(oneDimArr, oneDimArr.length);
        System.out.println("\n" + Arrays.toString(copyOfOneDimArr) + nLine);

        //Check if arrays are really copied.
        var testArr = copyOfOneDimArr;
        System.out.printf("Is Equals: %s", testArr.equals(copyOfOneDimArr) + nLine);
        System.out.printf("Is Equals: %s", copyOfOneDimArr.equals(oneDimArr) + nLine);
    }

}
