package OOP.matrixClass;

import java.util.Scanner;

public class MatrixUI {

    public static void main(String[] args) {

        //define matrix
        int matrixHeight = 2;
        int matrixWidth = 2;

        Matrix firstMatrix = new Matrix(matrixHeight, matrixWidth);
        firstMatrix.setValue(0, 0, 1);   //<- setValue(int row, int col, int value)
        firstMatrix.setValue(1, 1, -12);

        Matrix secondMatrix = new Matrix(matrixHeight, matrixWidth);
        secondMatrix.setValue(0, 1, 2);
        secondMatrix.setValue(1, 1, 24);
        
        //input
        System.out.println("Use predefined parameter for matrices? Y/n (n = enter new one): ");
        Scanner input = new Scanner(System.in);
        char userChoice = input.next().charAt(0);
        if ((userChoice == 'N') || (userChoice == 'n')) {
            
        }
        
        //calculate result and print
        Matrix addingMatrices = Matrix.add(firstMatrix, secondMatrix);
        System.out.println(addingMatrices.toString());
    
        Matrix subtractingMatrices = Matrix.subtract(firstMatrix, secondMatrix);
        System.out.println(subtractingMatrices);
        
        Matrix multiplyingMatrices = Matrix.multiply(firstMatrix, secondMatrix);
        System.out.println(multiplyingMatrices);
    }

}
