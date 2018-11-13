package arrays;

public class Array_Matrices {

    public static void main(String[] args) {

        //1.Matrix of Multidimensional array
        ////////////////////////////////////////////////////////
        byte n = 2; //matrix size 2x2
        //declare array 
        int[][] matrix = new int[n][n];
        //assign values
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (row + col) + 1;
            }
        }
        //print
        for (int[] rowToPrint : matrix) { //NOTE: The Enumerator in Java catch elements from multidimensional array line by line, unlike C#, where the Enumerator do that element by element.
            for (int colToPrint : rowToPrint) {
                System.out.print(colToPrint + " ");
            }
            System.out.println();
        }
        System.out.println();
        ////////////////////////////////////////////////////////

        
        //2.Matrix of Jagged Arrays
        ////////////////////////////////////////////////////////
        byte m = 2; //matrix size 2x2
        //declare array
        int[][] matrixOfJaggArr = new int[m][];
        //assign values
        for (int row = 0; row < matrixOfJaggArr.length; row++) {

            matrixOfJaggArr[row] = new int[m];  //<-declare array (matrix 2x2)
            for (int col = 0; col < matrixOfJaggArr[row].length; col++) {
                matrixOfJaggArr[row][col] = (row + col) + 1;
            }
        }
        //print
        for (int row = 0; row < matrixOfJaggArr.length; row++) {
            for (int col : matrixOfJaggArr[row]) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        ////////////////////////////////////////////////////////
    }
}
